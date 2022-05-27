package com.daCodes.data.response

data class ModelResponse (
    val id: String,
    val name: String,
    val brand: String,
    val subModels: List<SubModelResponse>,
    val created: Long,
    val modif: Long
)