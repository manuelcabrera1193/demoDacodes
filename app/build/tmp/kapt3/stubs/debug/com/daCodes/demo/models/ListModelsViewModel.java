package com.daCodes.demo.models;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013JC\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00180\u00152\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\u0006\u0010\u001a\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/daCodes/demo/models/ListModelsViewModel;", "Landroidx/lifecycle/ViewModel;", "getModelsUseCase", "Lcom/daCodes/domain/usecase/GetModelsUseCase;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/daCodes/domain/usecase/GetModelsUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/daCodes/demo/models/ModelStates;", "viewState", "Landroidx/lifecycle/LiveData;", "getViewState", "()Landroidx/lifecycle/LiveData;", "getModels", "", "id", "Ljava/util/ArrayList;", "Lcom/daCodes/models/Brand;", "Lkotlin/collections/ArrayList;", "model", "Lcom/daCodes/models/ResultType;", "", "Lcom/daCodes/models/Model;", "Lcom/daCodes/models/Failure;", "brands", "dispatcher", "(Ljava/util/ArrayList;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ListModelsViewModel extends androidx.lifecycle.ViewModel {
    private final com.daCodes.domain.usecase.GetModelsUseCase getModelsUseCase = null;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher = null;
    private final androidx.lifecycle.MutableLiveData<com.daCodes.demo.models.ModelStates> _viewState = null;
    
    public ListModelsViewModel(@org.jetbrains.annotations.NotNull()
    com.daCodes.domain.usecase.GetModelsUseCase getModelsUseCase, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher defaultDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.daCodes.demo.models.ModelStates> getViewState() {
        return null;
    }
    
    public final void getModels(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.daCodes.models.Brand> id) {
    }
    
    private final java.lang.Object model(java.util.ArrayList<com.daCodes.models.Brand> brands, kotlinx.coroutines.CoroutineDispatcher dispatcher, kotlin.coroutines.Continuation<? super com.daCodes.models.ResultType<java.util.List<com.daCodes.models.Model>, com.daCodes.models.Failure>> continuation) {
        return null;
    }
}