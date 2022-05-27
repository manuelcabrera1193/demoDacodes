package com.daCodes.data.mapper

import com.daCodes.data.response.BrandResponse
import com.daCodes.models.Brand
import java.util.Date

fun List<BrandResponse>.toListBrands() : List<Brand> = this.map { it.toBrand() }

fun BrandResponse.toBrand() = Brand(
    id = id,
    name = name,
    img = img,
    created = Date(created),
    country =  country.map { it },
    tags = tags.map { it },
    modified = Date(modif),
)
