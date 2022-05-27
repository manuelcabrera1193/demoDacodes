package com.daCodes.demo.databinding;
import com.daCodes.demo.R;
import com.daCodes.demo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentListBrandsBindingImpl extends FragmentListBrandsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(1, 
            new String[] {"item_shimmer_brand", "item_shimmer_brand"},
            new int[] {2, 3},
            new int[] {com.daCodes.demo.R.layout.item_shimmer_brand,
                com.daCodes.demo.R.layout.item_shimmer_brand});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lineGuideLeft, 4);
        sViewsWithIds.put(R.id.lineGuideRight, 5);
        sViewsWithIds.put(R.id.cardTitle, 6);
        sViewsWithIds.put(R.id.titleBrand, 7);
        sViewsWithIds.put(R.id.checkBoxBrand, 8);
        sViewsWithIds.put(R.id.listBrands, 9);
        sViewsWithIds.put(R.id.buttonCard, 10);
        sViewsWithIds.put(R.id.button, 11);
        sViewsWithIds.put(R.id.btnError, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.daCodes.demo.databinding.ItemShimmerBrandBinding mboundView1;
    @Nullable
    private final com.daCodes.demo.databinding.ItemShimmerBrandBinding mboundView11;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentListBrandsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentListBrandsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[12]
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[10]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (android.widget.CheckBox) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (android.widget.LinearLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            );
        this.loadingView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.daCodes.demo.databinding.ItemShimmerBrandBinding) bindings[2];
        setContainedBinding(this.mboundView1);
        this.mboundView11 = (com.daCodes.demo.databinding.ItemShimmerBrandBinding) bindings[3];
        setContainedBinding(this.mboundView11);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        mboundView1.invalidateAll();
        mboundView11.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView1.hasPendingBindings()) {
            return true;
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView1.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(mboundView1);
        executeBindingsOn(mboundView11);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}