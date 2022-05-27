package com.daCodes.domain.repository

import com.daCodes.models.Brand
import com.daCodes.models.Failure
import com.daCodes.models.ResultType

interface BrandRepository {
    suspend fun getAllBrands(): ResultType<List<Brand>, Failure>
}