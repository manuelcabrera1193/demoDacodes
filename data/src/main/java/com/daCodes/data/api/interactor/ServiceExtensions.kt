package com.daCodes.data.api.interactor

import android.annotation.SuppressLint
import com.daCodes.data.api.model.ApiBuilder
import com.google.gson.JsonParser
import retrofit2.Response
import com.daCodes.data.api.model.Result
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

val CODES = listOf(204,201)

fun ApiBuilder.url() = this.base.plus(this.endpoint)

fun executeCoroutine(response: Response<Any>): Result {
    return if (response.isSuccessful) {
        var model: Any? = null

        if (!CODES.contains(response.code())) {
            model = response.body()
        }

        Result(response.code(),true, model, null)
    } else {
        val error = response.errorBody()!!.string()
        val parser = JsonParser()
        val jsonObject = parser.parse(error).asJsonObject

        Result(response.code(),false, null, jsonObject)
    }
}

@SuppressLint("CheckResult")
fun executeRx(single: Single<Response<Any>>): Single<Response<Any>> {
    single.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
    return single
}
