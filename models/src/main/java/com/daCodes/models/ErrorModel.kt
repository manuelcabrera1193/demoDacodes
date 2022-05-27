package com.daCodes.models

data class ErrorModel(
    val code: String? = null,
    val description: String? = String(),
    val others: Map<String, Any>? = null
)