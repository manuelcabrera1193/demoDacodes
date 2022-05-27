package com.daCodes.domain.usecase

import com.daCodes.domain.repository.BrandRepository
import com.daCodes.models.Brand
import com.daCodes.models.Failure
import com.daCodes.models.ResultType

class GetBrandsUseCase (private val repository: BrandRepository) {
    suspend operator  fun invoke(): ResultType<List<Brand>, Failure> = repository.getAllBrands()
}