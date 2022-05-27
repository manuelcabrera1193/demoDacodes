package com.daCodes.demo.brands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0014B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/daCodes/demo/brands/ListAdapterBrands;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/daCodes/models/Brand;", "Lcom/daCodes/demo/brands/ListAdapterBrands$ViewHolder;", "events", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "brand", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ListAdapterBrandsCallback", "ViewHolder", "app_debug"})
public final class ListAdapterBrands extends androidx.recyclerview.widget.ListAdapter<com.daCodes.models.Brand, com.daCodes.demo.brands.ListAdapterBrands.ViewHolder> {
    private kotlin.jvm.functions.Function1<? super com.daCodes.models.Brand, kotlin.Unit> events;
    
    public ListAdapterBrands(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.daCodes.models.Brand, kotlin.Unit> events) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.daCodes.demo.brands.ListAdapterBrands.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.daCodes.demo.brands.ListAdapterBrands.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/daCodes/demo/brands/ListAdapterBrands$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/daCodes/demo/databinding/ItemBrandBinding;", "(Lcom/daCodes/demo/databinding/ItemBrandBinding;)V", "bin", "", "brand", "Lcom/daCodes/models/Brand;", "events", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.daCodes.demo.databinding.ItemBrandBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.daCodes.demo.brands.ListAdapterBrands.ViewHolder.Companion Companion = null;
        
        private ViewHolder(com.daCodes.demo.databinding.ItemBrandBinding binding) {
            super(null);
        }
        
        public final void bin(@org.jetbrains.annotations.NotNull()
        com.daCodes.models.Brand brand, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.daCodes.models.Brand, kotlin.Unit> events) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/daCodes/demo/brands/ListAdapterBrands$ViewHolder$Companion;", "", "()V", "from", "Lcom/daCodes/demo/brands/ListAdapterBrands$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.daCodes.demo.brands.ListAdapterBrands.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/daCodes/demo/brands/ListAdapterBrands$ListAdapterBrandsCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/daCodes/models/Brand;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class ListAdapterBrandsCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.daCodes.models.Brand> {
        
        public ListAdapterBrandsCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.daCodes.models.Brand oldItem, @org.jetbrains.annotations.NotNull()
        com.daCodes.models.Brand newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.daCodes.models.Brand oldItem, @org.jetbrains.annotations.NotNull()
        com.daCodes.models.Brand newItem) {
            return false;
        }
    }
}