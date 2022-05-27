package com.daCodes.data.api.model

class Result(
    val code: Int,
    val isSuccessful: Boolean,
    val body: Any?,
    val error: Any?
)