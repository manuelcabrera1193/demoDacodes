package com.daCodes.data.service

import com.daCodes.data.api.ApiManager
import com.daCodes.data.api.model.ApiBuilder
import com.daCodes.data.api.model.ExecuteType
import com.daCodes.data.api.model.MethodHttp
import com.daCodes.data.datastore.ModelDataStore
import com.daCodes.data.mapper.toListModels
import com.daCodes.data.response.ModelResponse
import com.daCodes.models.ErrorModel
import com.daCodes.models.Failure
import com.daCodes.models.Model
import com.daCodes.models.ResultType
import com.google.gson.Gson
import java.lang.Exception

class ModelDataStoreImp : ModelDataStore {
    override suspend fun getModels(id: String): ResultType<List<Model>, Failure> {
        val apiBuilder = ApiBuilder.Builder()
            .base(ApiConstants.baseUrl)
            .endpoint(ApiConstants.models.replaceUrlParameter(ApiConstants.keyBrand, id))
            .method(MethodHttp.GET)
            .type(ExecuteType.COROUTINES)
            .config()

        return try {
            val result =
                ApiManager.with(apiBuilder)
                    .connect()
            if (result.isSuccessful) {
                val list = Gson().run {
                    fromJson(this.toJson(result.body), Array<ModelResponse>::class.java).toList()
                }
                ResultType.Success(list.toListModels())
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
            ResultType.Error(Failure.Error(ErrorModel(description = "ModelDataStoreImp Error-> ${e.message}")))
        }
    }

    private fun String.replaceUrlParameter(key: String, value: String) : String = this.replace(key, value)

}