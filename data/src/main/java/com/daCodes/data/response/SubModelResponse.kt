package com.daCodes.data.response

data class SubModelResponse(
    val id: String,
    val year: Long? = null,
    val fuelType: String? = null,
    val compatibility: String? = null,
    val modif: Long = 0,
    val tester: String? = null
)
