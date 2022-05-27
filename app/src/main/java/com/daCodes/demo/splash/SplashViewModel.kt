package com.daCodes.demo.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {

    private val _viewState = MutableLiveData<SplashStates>()
    val viewState: LiveData<SplashStates> get() = _viewState

    init {
        preValidation()
    }
    private fun preValidation() {
        viewModelScope.launch {
            _viewState.value = SplashStates.Loading
            delay(3100)
            _viewState.value = SplashStates.Success
        }
    }
}