package com.daCodes.data.service

import com.daCodes.data.api.ApiManager
import com.daCodes.data.api.model.ApiBuilder
import com.daCodes.data.api.model.ExecuteType
import com.daCodes.data.api.model.MethodHttp
import com.daCodes.data.datastore.BrandDataStore
import com.daCodes.data.mapper.toListBrands
import com.daCodes.data.response.BrandResponse
import com.daCodes.models.Brand
import com.daCodes.models.ErrorModel
import com.daCodes.models.Failure
import com.daCodes.models.ResultType
import com.google.gson.Gson
import java.lang.Exception

class BrandDataStoreImp : BrandDataStore {
    override suspend fun getAllBrands(): ResultType<List<Brand>, Failure> {
        val apiBuilder = ApiBuilder.Builder()
            .base(ApiConstants.baseUrl)
            .endpoint(ApiConstants.brands)
            .method(MethodHttp.GET)
            .type(ExecuteType.COROUTINES)
            .config()
        return try {
            val result =
                ApiManager.with(apiBuilder)
                    .connect()
            if (result.isSuccessful) {
                val list = Gson().run {
                    fromJson(this.toJson(result.body), Array<BrandResponse>::class.java).toList()
                }
                ResultType.Success(list.toListBrands())
            } else {
                val failure :Failure = when(result.code){
                    401 -> Failure.UnAuthorized
                    404 -> Failure.Http
                    500 -> Failure.Server
                    else -> Failure.UnExpected
                }
                ResultType.Error(failure)
            }
        } catch (e: Exception) {
            ResultType.Error(Failure.Error(ErrorModel(description = "BrandDataStoreImp Error-> ${e.message}")))
        }
    }
}