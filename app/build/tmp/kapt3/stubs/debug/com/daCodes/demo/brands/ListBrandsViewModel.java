package com.daCodes.demo.brands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/daCodes/demo/brands/ListBrandsViewModel;", "Landroidx/lifecycle/ViewModel;", "getBrandUseCase", "Lcom/daCodes/domain/usecase/GetBrandsUseCase;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/daCodes/domain/usecase/GetBrandsUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/daCodes/demo/brands/BrandStates;", "viewState", "Landroidx/lifecycle/LiveData;", "getViewState", "()Landroidx/lifecycle/LiveData;", "getBranch", "", "app_debug"})
public final class ListBrandsViewModel extends androidx.lifecycle.ViewModel {
    private final com.daCodes.domain.usecase.GetBrandsUseCase getBrandUseCase = null;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher = null;
    private final androidx.lifecycle.MutableLiveData<com.daCodes.demo.brands.BrandStates> _viewState = null;
    
    public ListBrandsViewModel(@org.jetbrains.annotations.NotNull()
    com.daCodes.domain.usecase.GetBrandsUseCase getBrandUseCase, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher defaultDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.daCodes.demo.brands.BrandStates> getViewState() {
        return null;
    }
    
    public final void getBranch() {
    }
}