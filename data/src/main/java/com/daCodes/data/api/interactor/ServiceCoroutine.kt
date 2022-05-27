package com.daCodes.data.api.interactor

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.DELETE
import retrofit2.http.PUT
import retrofit2.http.PATCH
import retrofit2.http.Url
import retrofit2.http.Body

interface ServiceCoroutine {

    @GET
    fun getAsync(@Url url: String): Deferred<Response<Any>>

    @POST
    fun postAsync(@Url url: String, @Body body: Any?): Deferred<Response<Any>>

    @DELETE
    fun deleteAsync(@Url url: String): Deferred<Response<Any>>

    @PUT
    fun putAsync(@Url url: String, @Body body: Any?): Deferred<Response<Any>>

    @PATCH
    fun patchAsync(@Url url: String, @Body body: Any?): Deferred<Response<Any>>
}