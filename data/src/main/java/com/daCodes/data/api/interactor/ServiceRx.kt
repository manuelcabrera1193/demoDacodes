package com.daCodes.data.api.interactor

import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.DELETE
import retrofit2.http.PUT
import retrofit2.http.PATCH
import retrofit2.http.Url
import retrofit2.http.Body

interface ServiceRx {

    @GET
    fun get(@Url url: String): Single<Response<Any>>

    @POST
    fun post(@Url url: String, @Body body: Any?): Single<Response<Any>>

    @DELETE
    fun delete(@Url url: String): Single<Response<Any>>

    @PUT
    fun put(@Url url: String, @Body body: Any?): Single<Response<Any>>

    @PATCH
    fun patch(@Url url: String, @Body body: Any?): Single<Response<Any>>
}