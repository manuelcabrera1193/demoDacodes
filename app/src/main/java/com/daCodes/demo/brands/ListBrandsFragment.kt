package com.daCodes.demo.brands

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.daCodes.data.repository.BrandRepositoryImp
import com.daCodes.data.service.BrandDataStoreImp
import com.daCodes.demo.main.MainViewModel
import com.daCodes.demo.R
import com.daCodes.demo.databinding.FragmentListBrandsBinding
import com.daCodes.demo.util.getViewModel
import com.daCodes.domain.usecase.GetBrandsUseCase
import com.daCodes.models.Brand

class ListBrandsFragment : Fragment() {

    private var _binding: FragmentListBrandsBinding? = null
    private val binding get() = _binding!!

    private val listAdapterBrands by lazy {
        ListAdapterBrands(::click)
    }

    private val viewModel: ListBrandsViewModel by lazy {
        requireActivity().getViewModel {
            ListBrandsViewModel(GetBrandsUseCase(BrandRepositoryImp(BrandDataStoreImp())))
        }
    }
    private val mainViewModel: MainViewModel by lazy {
        requireActivity().getViewModel {
            MainViewModel()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBrandsBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.listBrands.adapter = listAdapterBrands
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onResume() {
        super.onResume()
        binding.buttonCard.isVisible = binding.checkBoxBrand.isChecked
        mainViewModel.brands = arrayListOf()
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.viewState.observe(viewLifecycleOwner, Observer(::brands))
        binding.checkBoxBrand.setOnClickListener {
            listAdapterBrands.apply {
                currentList.map {
                    it.isMultiple = !it.isMultiple
                }
                notifyDataSetChanged()
            }
            binding.buttonCard.isVisible = binding.checkBoxBrand.isChecked
        }
        binding.button.setOnClickListener {
            val list = listAdapterBrands.currentList.filter { it.isSelected }
            if (!list.isNullOrEmpty()) {
                goModels(list)
            } else {
                Toast.makeText(
                    requireContext(),
                    R.string.validate_brands,
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    private fun brands(brandStates: BrandStates) {
        when (brandStates) {
            BrandStates.Error -> {
                binding.loadingView.isVisible = false
                binding.btnError.apply {
                    isVisible = true
                    setOnClickListener {
                        viewModel.getBranch()
                    }
                }
                Toast.makeText(requireContext(), R.string.error, Toast.LENGTH_LONG).show()
            }
            BrandStates.Loading -> {
                binding.btnError.isVisible = false
                binding.loadingView.isVisible = true
            }
            is BrandStates.Success -> {
                binding.btnError.isVisible = false
                binding.loadingView.isVisible = false
                listAdapterBrands.submitList(brandStates.value)
            }
        }
    }

    private fun goModels(brands: List<Brand>) {
        mainViewModel.brands.addAll(brands)
        findNavController().navigate(R.id.action_listBrandsFragment_to_listModelsFragment)
    }

    private fun click(brand: Brand) {
        if (!binding.checkBoxBrand.isChecked) goModels(arrayListOf(brand))
    }
}