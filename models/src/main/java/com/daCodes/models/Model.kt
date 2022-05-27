package com.daCodes.models

import java.util.Date

data class Model (
    val id: String,
    val name: String,
    val brand: String,
    val subModels: List<SubModel>,
    val created: Date,
    val modified: Date,
    var brandModel: Brand? = null
)
