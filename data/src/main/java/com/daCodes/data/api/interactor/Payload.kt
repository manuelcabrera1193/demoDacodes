package com.daCodes.data.api.interactor

import com.daCodes.data.api.ApiManager
import com.daCodes.data.api.model.ApiBuilder
import com.daCodes.data.api.model.MethodHttp
import io.reactivex.Single
import retrofit2.Response

class Payload : IPayload {

    override fun payloadRx(apiBuilder: ApiBuilder): Single<Response<Any>> {
        val response = ApiManager
            .go(apiBuilder, ServiceRx::class.java)

        return when (apiBuilder.method) {
            MethodHttp.GET, MethodHttp.UNDEFINED  -> response.get(
                apiBuilder.url()
            )
            MethodHttp.POST -> response.post(
                apiBuilder.url(),
                apiBuilder.body,
            )
            MethodHttp.PUT -> response.put(
                apiBuilder.url(),
                apiBuilder.body,
            )
            MethodHttp.PATCH -> response.patch(
                apiBuilder.url(),
                apiBuilder.body,
            )
            MethodHttp.DELETE -> response.delete(
                apiBuilder.url()
            )
        }
    }

    override suspend fun payloadCoroutine(apiBuilder: ApiBuilder): Response<Any> {
        val response = ApiManager
            .go(apiBuilder, ServiceCoroutine::class.java)
        return when (apiBuilder.method) {
            MethodHttp.GET, MethodHttp.UNDEFINED -> response.getAsync(
                apiBuilder.url(),
            ).await()
            MethodHttp.POST -> response.postAsync(
                apiBuilder.url(),
                apiBuilder.body,
            ).await()
            MethodHttp.PUT -> response.putAsync(
                apiBuilder.url(),
                apiBuilder.body,
            ).await()
            MethodHttp.PATCH -> response.patchAsync(
                apiBuilder.url(),
                apiBuilder.body,
            ).await()
            MethodHttp.DELETE -> response.deleteAsync(
                apiBuilder.url(),
            ).await()
        }
    }
}