package com.daCodes.demo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.daCodes.demo.databinding.FragmentListBrandsBindingImpl;
import com.daCodes.demo.databinding.FragmentListModelsBindingImpl;
import com.daCodes.demo.databinding.FragmentSplashBindingImpl;
import com.daCodes.demo.databinding.ItemBrandBindingImpl;
import com.daCodes.demo.databinding.ItemModelBindingImpl;
import com.daCodes.demo.databinding.ItemShimmerBrandBindingImpl;
import com.daCodes.demo.databinding.ItemShimmerModelBindingImpl;
import com.daCodes.demo.databinding.ItemSubModelBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTLISTBRANDS = 1;

  private static final int LAYOUT_FRAGMENTLISTMODELS = 2;

  private static final int LAYOUT_FRAGMENTSPLASH = 3;

  private static final int LAYOUT_ITEMBRAND = 4;

  private static final int LAYOUT_ITEMMODEL = 5;

  private static final int LAYOUT_ITEMSHIMMERBRAND = 6;

  private static final int LAYOUT_ITEMSHIMMERMODEL = 7;

  private static final int LAYOUT_ITEMSUBMODEL = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.daCodes.demo.R.layout.fragment_list_brands, LAYOUT_FRAGMENTLISTBRANDS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.daCodes.demo.R.layout.fragment_list_models, LAYOUT_FRAGMENTLISTMODELS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.daCodes.demo.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.daCodes.demo.R.layout.item_brand, LAYOUT_ITEMBRAND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.daCodes.demo.R.layout.item_model, LAYOUT_ITEMMODEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.daCodes.demo.R.layout.item_shimmer_brand, LAYOUT_ITEMSHIMMERBRAND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.daCodes.demo.R.layout.item_shimmer_model, LAYOUT_ITEMSHIMMERMODEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.daCodes.demo.R.layout.item_sub_model, LAYOUT_ITEMSUBMODEL);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTLISTBRANDS: {
          if ("layout/fragment_list_brands_0".equals(tag)) {
            return new FragmentListBrandsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list_brands is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLISTMODELS: {
          if ("layout/fragment_list_models_0".equals(tag)) {
            return new FragmentListModelsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list_models is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBRAND: {
          if ("layout/item_brand_0".equals(tag)) {
            return new ItemBrandBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_brand is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMODEL: {
          if ("layout/item_model_0".equals(tag)) {
            return new ItemModelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_model is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSHIMMERBRAND: {
          if ("layout/item_shimmer_brand_0".equals(tag)) {
            return new ItemShimmerBrandBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_shimmer_brand is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSHIMMERMODEL: {
          if ("layout/item_shimmer_model_0".equals(tag)) {
            return new ItemShimmerModelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_shimmer_model is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSUBMODEL: {
          if ("layout/item_sub_model_0".equals(tag)) {
            return new ItemSubModelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_sub_model is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/fragment_list_brands_0", com.daCodes.demo.R.layout.fragment_list_brands);
      sKeys.put("layout/fragment_list_models_0", com.daCodes.demo.R.layout.fragment_list_models);
      sKeys.put("layout/fragment_splash_0", com.daCodes.demo.R.layout.fragment_splash);
      sKeys.put("layout/item_brand_0", com.daCodes.demo.R.layout.item_brand);
      sKeys.put("layout/item_model_0", com.daCodes.demo.R.layout.item_model);
      sKeys.put("layout/item_shimmer_brand_0", com.daCodes.demo.R.layout.item_shimmer_brand);
      sKeys.put("layout/item_shimmer_model_0", com.daCodes.demo.R.layout.item_shimmer_model);
      sKeys.put("layout/item_sub_model_0", com.daCodes.demo.R.layout.item_sub_model);
    }
  }
}
