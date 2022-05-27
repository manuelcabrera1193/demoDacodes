package com.daCodes.demo.brands

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.daCodes.demo.databinding.ItemBrandBinding
import com.daCodes.demo.util.*
import com.daCodes.models.Brand

class ListAdapterBrands(
    private var events: (brand: Brand)-> Unit,
) :
    ListAdapter<Brand, ListAdapterBrands.ViewHolder>(ListAdapterBrandsCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder.from(parent)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        //item.isSelected = events.getState(item.id)
        holder.bin(item, events)
    }

    class ViewHolder private constructor(private val binding: ItemBrandBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bin(
            brand: Brand,
            events: (brand: Brand)-> Unit
        ) {
            binding.apply {
                ivRight.loadArrow()
                description.text = brand.name
                create.text = dateString(brand.created)
                ivRight.isVisible = !brand.isMultiple
                switchBrand.isVisible = brand.isMultiple
                switchBrand.isChecked = brand.isSelected
                if (brand.country.isNotEmpty()) {
                    countries.text = labelCountry(brand).plus(brand.country.joinToString(" - "))
                }
                if (brand.img.isNullOrEmpty()) {
                    ivLogo.loadDefault()
                } else {
                    ivLogo.loadUrl(brand.img!!)
                }
                switchBrand.setOnCheckedChangeListener { _, b ->
                    brand.isSelected = b
                }
                cardItemBrand.setOnClickListener {
                    events(brand)
                }
            }
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemBrandBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    class ListAdapterBrandsCallback : DiffUtil.ItemCallback<Brand>() {
        override fun areItemsTheSame(oldItem: Brand, newItem: Brand): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Brand, newItem: Brand): Boolean {
            return oldItem == newItem
        }
    }
}