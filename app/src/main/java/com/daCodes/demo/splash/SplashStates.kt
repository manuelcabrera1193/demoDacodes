package com.daCodes.demo.splash

sealed class SplashStates {
    object Loading : SplashStates()
    object Success : SplashStates()
}