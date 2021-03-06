// Generated by data binding compiler. Do not edit!
package com.daCodes.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.daCodes.demo.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentListModelsBinding extends ViewDataBinding {
  @NonNull
  public final Button btnError;

  @NonNull
  public final CardView cardTitle;

  @NonNull
  public final Guideline lineGuideLeft;

  @NonNull
  public final Guideline lineGuideRight;

  @NonNull
  public final RecyclerView listModels;

  @NonNull
  public final LinearLayout loadingView;

  @NonNull
  public final AppCompatTextView titleModel;

  protected FragmentListModelsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnError, CardView cardTitle, Guideline lineGuideLeft, Guideline lineGuideRight,
      RecyclerView listModels, LinearLayout loadingView, AppCompatTextView titleModel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnError = btnError;
    this.cardTitle = cardTitle;
    this.lineGuideLeft = lineGuideLeft;
    this.lineGuideRight = lineGuideRight;
    this.listModels = listModels;
    this.loadingView = loadingView;
    this.titleModel = titleModel;
  }

  @NonNull
  public static FragmentListModelsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_models, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListModelsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentListModelsBinding>inflateInternal(inflater, R.layout.fragment_list_models, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentListModelsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_models, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListModelsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentListModelsBinding>inflateInternal(inflater, R.layout.fragment_list_models, null, false, component);
  }

  public static FragmentListModelsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentListModelsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentListModelsBinding)bind(component, view, R.layout.fragment_list_models);
  }
}
