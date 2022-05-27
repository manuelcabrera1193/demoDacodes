package com.daCodes.data.response


data class BrandResponse (
    val id: String,
    val name: String,
    val img: String? = null,
    val created: Long,
    val country: List<String>,
    val tags: List<String>,
    val modif: Long
)