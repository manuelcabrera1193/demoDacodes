package com.daCodes.data.datastore

import com.daCodes.models.Brand
import com.daCodes.models.Failure
import com.daCodes.models.ResultType

interface BrandDataStore {
    suspend fun getAllBrands(): ResultType<List<Brand>, Failure>
}