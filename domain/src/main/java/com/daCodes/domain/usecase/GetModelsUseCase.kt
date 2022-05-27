package com.daCodes.domain.usecase

import com.daCodes.domain.repository.ModelsRepository
import com.daCodes.models.Failure
import com.daCodes.models.Model
import com.daCodes.models.ResultType

class GetModelsUseCase(private val repository: ModelsRepository) {
    suspend operator  fun invoke(id: String): ResultType<List<Model>, Failure> = repository.getModels(id)
}