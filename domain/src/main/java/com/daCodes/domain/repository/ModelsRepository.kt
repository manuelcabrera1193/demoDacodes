package com.daCodes.domain.repository

import com.daCodes.models.Failure
import com.daCodes.models.Model
import com.daCodes.models.ResultType

interface ModelsRepository {
    suspend fun getModels(id: String) : ResultType<List<Model>, Failure>
}