package com.daCodes.data.api.interactor

import com.daCodes.data.api.model.ApiBuilder
import com.daCodes.data.api.model.MethodHttp
import com.daCodes.data.api.model.Result
import io.reactivex.Single
import retrofit2.Response

class GlobalBuilder(private val apiBuilder: ApiBuilder) {
    suspend fun connect(): Result =
        when (apiBuilder.method) {
            MethodHttp.GET -> EnumPayloadCoroutine.GET.execute(apiBuilder)
            MethodHttp.POST -> EnumPayloadCoroutine.POST.execute(apiBuilder)
            MethodHttp.PUT -> EnumPayloadCoroutine.PUT.execute(apiBuilder)
            MethodHttp.PATCH -> EnumPayloadCoroutine.PATCH.execute(apiBuilder)
            MethodHttp.DELETE -> EnumPayloadCoroutine.DELETE.execute(apiBuilder)
            MethodHttp.UNDEFINED -> EnumPayloadCoroutine.UNDEFINED.execute(apiBuilder)

        }

    fun connectRx(): Single<Response<Any>> =
        when (apiBuilder.method) {
            MethodHttp.GET -> EnumPayloadRx.GET.execute(apiBuilder)
            MethodHttp.POST -> EnumPayloadRx.POST.execute(apiBuilder)
            MethodHttp.PUT -> EnumPayloadRx.PUT.execute(apiBuilder)
            MethodHttp.PATCH -> EnumPayloadRx.PATCH.execute(apiBuilder)
            MethodHttp.DELETE -> EnumPayloadRx.DELETE.execute(apiBuilder)
            MethodHttp.UNDEFINED -> EnumPayloadRx.UNDEFINED.execute(apiBuilder)
        }

}