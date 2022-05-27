package com.daCodes.data.mapper

import com.daCodes.data.response.ModelResponse
import com.daCodes.data.response.SubModelResponse
import com.daCodes.models.Model
import com.daCodes.models.SubModel
import java.util.Date


fun List<ModelResponse>.toListModels() : List<Model> = this.map { it.toModel() }

fun ModelResponse.toModel() = Model(
    id = id,
    name = name,
    brand = brand,
    subModels = subModels.map { it.toSubModel() },
    created = Date(created),
    modified = Date(modif),
)

fun SubModelResponse.toSubModel() = SubModel(
    id = id,
    year = year,
    fuelType = fuelType,
    compatibility = compatibility,
    modified = Date(modif),
    tester = tester,
)
