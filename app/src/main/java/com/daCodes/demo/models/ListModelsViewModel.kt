package com.daCodes.demo.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.daCodes.demo.util.patternSplit
import com.daCodes.domain.usecase.GetModelsUseCase
import com.daCodes.models.*
import kotlinx.coroutines.*

@ExperimentalCoroutinesApi
class ListModelsViewModel(
    private val getModelsUseCase: GetModelsUseCase,
    private val defaultDispatcher: CoroutineDispatcher = Dispatchers.IO
) :
    ViewModel() {

    private val _viewState = MutableLiveData<ModelStates>()
    val viewState: LiveData<ModelStates> get() = _viewState


    fun getModels(id: ArrayList<Brand>) {
        _viewState.value = ModelStates.Loading
        viewModelScope.launch {
            when (val result = model(id, defaultDispatcher)) {
                is ResultType.Success -> {
                    _viewState.value = ModelStates.Success(result.value)
                }
                is ResultType.Error -> {
                    _viewState.value = ModelStates.Error
                }
            }
        }
    }

    private suspend fun model(
        brands: ArrayList<Brand>,
        dispatcher: CoroutineDispatcher
    ): ResultType<List<Model>, Failure> {
        return try {
            val list: ArrayList<Model> = arrayListOf()
            withContext(dispatcher) {
                val ids = brands.joinToString(patternSplit) {
                    it.id
                }
                ids.split(patternSplit).map { id ->
                    async {
                        val item = getModelsUseCase.invoke(id)
                        val brandSelect = brands.find {
                            it.id == id
                        }
                        if (item is ResultType.Success) {
                            item.value.map {
                                it.brandModel = brandSelect
                            }
                            list.addAll(item.value)
                        }
                    }
                }
            }.awaitAll()
            ResultType.Success(list)
        } catch (e: Exception) {
            ResultType.Error(Failure.Error(ErrorModel(description = e.message)))
        }
    }

}