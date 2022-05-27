package com.daCodes.models

import java.util.Date

data class SubModel(
    val id: String,
    val year: Long? = null,
    val fuelType: String? = null,
    val compatibility: String? = null,
    val modified: Date? = null,
    val tester: String? = null
)
