@file:Suppress("UNCHECKED_CAST")

package com.daCodes.demo.util

import android.widget.ImageView
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.daCodes.demo.R
import com.daCodes.models.Brand
import com.squareup.picasso.Picasso
import java.text.SimpleDateFormat
import java.util.*

const val patternSplit = ".c(*_<->_*)c."

inline fun <reified T : ViewModel> FragmentActivity.getViewModel(crossinline factory: () -> T): T {
    val vmFactory = object : ViewModelProvider.Factory {
        override fun <U : ViewModel> create(modelClass: Class<U>): U = factory() as U
    }
    return ViewModelProvider(this, vmFactory).get()
}

fun ImageView.loadUrl(url: String) {
    Picasso.get().load(url).placeholder(R.drawable.ic_not_image)
        .error(R.drawable.ic_not_image).into(this)
}

fun ImageView.loadDefault() {
    Picasso.get().load(R.drawable.ic_not_image).placeholder(R.drawable.ic_not_image)
        .error(R.drawable.ic_not_image).into(this)
}

fun ImageView.loadArrow() {
    Picasso.get().load(R.drawable.arrow_right).placeholder(R.drawable.arrow_right)
        .error(R.drawable.arrow_right).into(this)
}

fun labelCountry(brand: Brand) = if (brand.country.size > 1) {
    "Countries: "
} else {
    "Country: "
}

fun dateString(create: Date?): String {
    return if (create == null) {
        ""
    } else {
        SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(create)
    }
}