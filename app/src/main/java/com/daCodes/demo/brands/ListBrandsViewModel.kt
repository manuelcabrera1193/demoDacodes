package com.daCodes.demo.brands

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.daCodes.domain.usecase.GetBrandsUseCase
import com.daCodes.models.ResultType
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListBrandsViewModel(
    private val getBrandUseCase: GetBrandsUseCase,
    private val defaultDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel() {

    private val _viewState = MutableLiveData<BrandStates>()
    val viewState: LiveData<BrandStates> get() = _viewState

    init {
        getBranch()
    }

    fun getBranch() {
        viewModelScope.launch {
            _viewState.value = BrandStates.Loading
            when (val result = withContext(defaultDispatcher) {
                getBrandUseCase.invoke()
            }) {
                is ResultType.Success -> {
                    _viewState.value = BrandStates.Success(result.value)
                }
                is ResultType.Error -> {
                    _viewState.value = BrandStates.Error
                }
            }
        }
    }

}

