// Generated by data binding compiler. Do not edit!
package com.daCodes.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.daCodes.demo.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemBrandBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayoutCompat actions;

  @NonNull
  public final CardView cardItemBrand;

  @NonNull
  public final AppCompatTextView countries;

  @NonNull
  public final AppCompatTextView create;

  @NonNull
  public final AppCompatTextView description;

  @NonNull
  public final AppCompatImageView ivLogo;

  @NonNull
  public final AppCompatImageView ivRight;

  @NonNull
  public final LinearLayout linearTexts;

  @NonNull
  public final SwitchCompat switchBrand;

  protected ItemBrandBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayoutCompat actions, CardView cardItemBrand, AppCompatTextView countries,
      AppCompatTextView create, AppCompatTextView description, AppCompatImageView ivLogo,
      AppCompatImageView ivRight, LinearLayout linearTexts, SwitchCompat switchBrand) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actions = actions;
    this.cardItemBrand = cardItemBrand;
    this.countries = countries;
    this.create = create;
    this.description = description;
    this.ivLogo = ivLogo;
    this.ivRight = ivRight;
    this.linearTexts = linearTexts;
    this.switchBrand = switchBrand;
  }

  @NonNull
  public static ItemBrandBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_brand, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemBrandBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemBrandBinding>inflateInternal(inflater, R.layout.item_brand, root, attachToRoot, component);
  }

  @NonNull
  public static ItemBrandBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_brand, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemBrandBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemBrandBinding>inflateInternal(inflater, R.layout.item_brand, null, false, component);
  }

  public static ItemBrandBinding bind(@NonNull View view) {
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
  public static ItemBrandBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemBrandBinding)bind(component, view, R.layout.item_brand);
  }
}
