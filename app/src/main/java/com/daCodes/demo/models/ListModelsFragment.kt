package com.daCodes.demo.models

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.daCodes.data.repository.ModelRepositoryImp
import com.daCodes.data.service.ModelDataStoreImp
import com.daCodes.demo.R
import com.daCodes.demo.main.MainViewModel
import com.daCodes.demo.databinding.FragmentListModelsBinding
import com.daCodes.demo.util.getViewModel
import com.daCodes.domain.usecase.GetModelsUseCase

class ListModelsFragment : Fragment() {

    private var _binding: FragmentListModelsBinding? = null
    private val binding get() = _binding!!
    private val listAdapterModels by lazy { ListAdapterModels() }
    private val viewModel: ListModelsViewModel by lazy {
        requireActivity().getViewModel {
            ListModelsViewModel(GetModelsUseCase(ModelRepositoryImp(ModelDataStoreImp())))
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
        _binding = FragmentListModelsBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.listModels.adapter = listAdapterModels
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.viewState.observe(viewLifecycleOwner, Observer(::models))
        viewModel.getModels(mainViewModel.brands)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mainViewModel.brands = arrayListOf()
        _binding = null
    }

    private fun models(modelStates: ModelStates) {
        when (modelStates) {
            ModelStates.Error -> {
                binding.loadingView.isVisible = false
                binding.btnError.apply {
                    isVisible = true
                    setOnClickListener {
                        viewModel.getModels(mainViewModel.brands)
                    }
                }
                Toast.makeText(requireContext(), R.string.error, Toast.LENGTH_LONG).show()
            }
            ModelStates.Loading -> {
                binding.btnError.isVisible = false
                binding.loadingView.isVisible = true
            }

            is ModelStates.Success -> {
                binding.btnError.isVisible = false
                binding.loadingView.isVisible = false
                listAdapterModels.submitList(modelStates.value)
            }
        }
    }

}