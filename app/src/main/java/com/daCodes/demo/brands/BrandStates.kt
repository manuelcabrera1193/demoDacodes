package com.daCodes.demo.brands

import com.daCodes.models.Brand

sealed class BrandStates{
    object Loading : BrandStates()
    data class Success(val value: List<Brand>) : BrandStates()
    object Error : BrandStates()
}