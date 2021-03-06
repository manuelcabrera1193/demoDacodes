// Generated by data binding compiler. Do not edit!
package com.daCodes.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.daCodes.demo.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemSubModelBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardItemModel;

  @NonNull
  public final AppCompatTextView compatibility;

  @NonNull
  public final AppCompatTextView fuelType;

  @NonNull
  public final LinearLayout linearTexts;

  @NonNull
  public final AppCompatTextView modified;

  @NonNull
  public final AppCompatTextView tester;

  @NonNull
  public final AppCompatTextView year;

  protected ItemSubModelBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardItemModel, AppCompatTextView compatibility, AppCompatTextView fuelType,
      LinearLayout linearTexts, AppCompatTextView modified, AppCompatTextView tester,
      AppCompatTextView year) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardItemModel = cardItemModel;
    this.compatibility = compatibility;
    this.fuelType = fuelType;
    this.linearTexts = linearTexts;
    this.modified = modified;
    this.tester = tester;
    this.year = year;
  }

  @NonNull
  public static ItemSubModelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_sub_model, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemSubModelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemSubModelBinding>inflateInternal(inflater, R.layout.item_sub_model, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSubModelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_sub_model, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemSubModelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemSubModelBinding>inflateInternal(inflater, R.layout.item_sub_model, null, false, component);
  }

  public static ItemSubModelBinding bind(@NonNull View view) {
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
  public static ItemSubModelBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemSubModelBinding)bind(component, view, R.layout.item_sub_model);
  }
}
