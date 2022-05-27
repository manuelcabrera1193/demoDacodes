package com.daCodes.demo.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/daCodes/demo/splash/SplashStates;", "", "()V", "Loading", "Success", "Lcom/daCodes/demo/splash/SplashStates$Loading;", "Lcom/daCodes/demo/splash/SplashStates$Success;", "app_debug"})
public abstract class SplashStates {
    
    private SplashStates() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/daCodes/demo/splash/SplashStates$Loading;", "Lcom/daCodes/demo/splash/SplashStates;", "()V", "app_debug"})
    public static final class Loading extends com.daCodes.demo.splash.SplashStates {
        @org.jetbrains.annotations.NotNull()
        public static final com.daCodes.demo.splash.SplashStates.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/daCodes/demo/splash/SplashStates$Success;", "Lcom/daCodes/demo/splash/SplashStates;", "()V", "app_debug"})
    public static final class Success extends com.daCodes.demo.splash.SplashStates {
        @org.jetbrains.annotations.NotNull()
        public static final com.daCodes.demo.splash.SplashStates.Success INSTANCE = null;
        
        private Success() {
            super();
        }
    }
}