package com.daCodes.demo.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/daCodes/demo/models/ListAdapterModels;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/daCodes/models/Model;", "Lcom/daCodes/demo/models/ListAdapterModels$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ListAdapterModelsCallback", "ViewHolder", "app_debug"})
public final class ListAdapterModels extends androidx.recyclerview.widget.ListAdapter<com.daCodes.models.Model, com.daCodes.demo.models.ListAdapterModels.ViewHolder> {
    
    public ListAdapterModels() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.daCodes.demo.models.ListAdapterModels.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.daCodes.demo.models.ListAdapterModels.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/daCodes/demo/models/ListAdapterModels$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/daCodes/demo/databinding/ItemModelBinding;", "(Lcom/daCodes/demo/databinding/ItemModelBinding;)V", "listAdapterSubModels", "Lcom/daCodes/demo/models/ListAdapterSubModels;", "getListAdapterSubModels", "()Lcom/daCodes/demo/models/ListAdapterSubModels;", "listAdapterSubModels$delegate", "Lkotlin/Lazy;", "bin", "", "model", "Lcom/daCodes/models/Model;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.daCodes.demo.databinding.ItemModelBinding binding = null;
        private final kotlin.Lazy listAdapterSubModels$delegate = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.daCodes.demo.models.ListAdapterModels.ViewHolder.Companion Companion = null;
        
        private ViewHolder(com.daCodes.demo.databinding.ItemModelBinding binding) {
            super(null);
        }
        
        private final com.daCodes.demo.models.ListAdapterSubModels getListAdapterSubModels() {
            return null;
        }
        
        public final void bin(@org.jetbrains.annotations.NotNull()
        com.daCodes.models.Model model) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/daCodes/demo/models/ListAdapterModels$ViewHolder$Companion;", "", "()V", "from", "Lcom/daCodes/demo/models/ListAdapterModels$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.daCodes.demo.models.ListAdapterModels.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/daCodes/demo/models/ListAdapterModels$ListAdapterModelsCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/daCodes/models/Model;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class ListAdapterModelsCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.daCodes.models.Model> {
        
        public ListAdapterModelsCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.daCodes.models.Model oldItem, @org.jetbrains.annotations.NotNull()
        com.daCodes.models.Model newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.daCodes.models.Model oldItem, @org.jetbrains.annotations.NotNull()
        com.daCodes.models.Model newItem) {
            return false;
        }
    }
}