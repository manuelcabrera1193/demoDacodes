package com.daCodes.demo.models

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.daCodes.demo.databinding.ItemModelBinding
import com.daCodes.demo.util.dateString
import com.daCodes.demo.util.loadDefault
import com.daCodes.demo.util.loadUrl
import com.daCodes.models.Model

class ListAdapterModels :
    ListAdapter<Model, ListAdapterModels.ViewHolder>(ListAdapterModelsCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder.from(parent)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bin(item)
    }

    class ViewHolder private constructor(private val binding: ItemModelBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val listAdapterSubModels by lazy { ListAdapterSubModels() }

        fun bin(model: Model) {
            binding.apply {
                name.text = "Model: ${model.name}"
                brand.text = "Brand: \n${model.brandModel?.name}"
                create.text = "Brand Created: \n${dateString(model.brandModel?.created)}\nModel Created: \n${dateString(model.created)}"
                if (model.brandModel?.img.isNullOrEmpty()) {
                    ivLogo.loadDefault()
                } else {
                    ivLogo.loadUrl(model.brandModel?.img!!)
                }
                listSubModels.adapter = listAdapterSubModels
            }
            listAdapterSubModels.submitList(model.subModels)
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemModelBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    class ListAdapterModelsCallback : DiffUtil.ItemCallback<Model>() {
        override fun areItemsTheSame(oldItem: Model, newItem: Model): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Model, newItem: Model): Boolean {
            return oldItem == newItem
        }
    }
}