package com.daCodes.models

import java.util.Date

data class Brand (
    val id: String,
    val name: String,
    val img: String? = null,
    val created: Date,
    val country: List<String>,
    val tags: List<String>,
    val modified: Date,
    var isMultiple: Boolean = false,
    var isSelected: Boolean = false
)