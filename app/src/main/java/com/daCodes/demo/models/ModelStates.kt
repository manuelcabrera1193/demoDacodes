package com.daCodes.demo.models

import com.daCodes.models.Model

sealed class ModelStates{
    object Loading : ModelStates()
    data class Success(val value: List<Model>) : ModelStates()
    object Error : ModelStates()
}