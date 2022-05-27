package com.daCodes.data.datastore

import com.daCodes.models.Failure
import com.daCodes.models.Model
import com.daCodes.models.ResultType

interface ModelDataStore {
    suspend fun getModels(id: String): ResultType<List<Model>, Failure>
}