package com.daCodes.data.api.interactor

import com.daCodes.data.api.model.ApiBuilder
import io.reactivex.Single
import retrofit2.Response

interface IPayload{

    @Throws(Throwable::class)
    fun payloadRx(apiBuilder: ApiBuilder): Single<Response<Any>>

    @Throws(Throwable::class)
    suspend fun payloadCoroutine(apiBuilder: ApiBuilder): Response<Any>
}



