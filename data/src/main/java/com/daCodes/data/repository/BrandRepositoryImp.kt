package com.daCodes.data.repository

import com.daCodes.data.datastore.BrandDataStore
import com.daCodes.domain.repository.BrandRepository
import com.daCodes.models.Brand
import com.daCodes.models.Failure
import com.daCodes.models.ResultType

class BrandRepositoryImp(private val brandDataStore: BrandDataStore) : BrandRepository {
    override suspend fun getAllBrands(): ResultType<List<Brand>, Failure> = brandDataStore.getAllBrands()
}