package com.daCodes.data.repository

import com.daCodes.data.datastore.ModelDataStore
import com.daCodes.domain.repository.ModelsRepository
import com.daCodes.models.Failure
import com.daCodes.models.Model
import com.daCodes.models.ResultType

class ModelRepositoryImp(private val modelDataStore: ModelDataStore) : ModelsRepository {
    override suspend fun getModels(id: String): ResultType<List<Model>, Failure> =
        modelDataStore.getModels(id)
}