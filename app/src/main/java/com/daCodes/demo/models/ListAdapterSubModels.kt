package com.daCodes.demo.models

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.daCodes.demo.databinding.ItemSubModelBinding
import com.daCodes.demo.util.dateString
import com.daCodes.models.SubModel

class ListAdapterSubModels :
    ListAdapter<SubModel, ListAdapterSubModels.ViewHolder>(ListAdapterSubModelsCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder.from(parent)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bin(item)
    }

    class ViewHolder private constructor(val binding: ItemSubModelBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bin(subModel: SubModel) {
            subModel.apply {
                year?.let {
                    binding.year.apply {
                        text =  "year: $it"
                        isVisible = true
                    }
                }
                fuelType?.let {
                    binding.fuelType.apply {
                        text = "fuelType: $it"
                        isVisible = true
                    }
                }
                compatibility?.let {
                    binding.compatibility.apply {
                        text = "compatibility: $it"
                        isVisible = true
                    }
                }
                modified?.let {
                    binding.modified.apply {
                        text = "modified: ${dateString(it)}"
                        isVisible = true
                    }
                }
                tester?.let {
                    binding.tester.apply {
                        text = "tester: $it"
                        isVisible = true
                    }
                }
            }


        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemSubModelBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }

    class ListAdapterSubModelsCallback : DiffUtil.ItemCallback<SubModel>() {
        override fun areItemsTheSame(oldItem: SubModel, newItem: SubModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: SubModel, newItem: SubModel): Boolean {
            return oldItem == newItem
        }
    }
}