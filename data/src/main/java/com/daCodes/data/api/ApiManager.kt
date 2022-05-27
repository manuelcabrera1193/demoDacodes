package com.daCodes.data.api

import com.daCodes.data.api.interactor.GlobalBuilder
import com.daCodes.data.api.model.ApiBuilder
import com.daCodes.data.api.model.ExecuteType
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiManager {

    fun <T> go(
        apiBuilder: ApiBuilder,
        service: Class<T>,
    ): T {
        return createService(apiBuilder, service)
    }

    private fun <T> createService(apiBuilder: ApiBuilder, apiService: Class<T>): T {
        return retrofit(apiBuilder)!!.create(apiService)
    }

    private fun retrofit(apiBuilder: ApiBuilder): Retrofit? {
        try {
            apiBuilder.base.let {
                val retrofitBuilder = Retrofit.Builder()
                    .baseUrl(apiBuilder.base)
                    .addConverterFactory(GsonConverterFactory.create())
                if (apiBuilder.type == ExecuteType.COROUTINES) {
                    retrofitBuilder.addCallAdapterFactory(CoroutineCallAdapterFactory())
                } else {
                    retrofitBuilder.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                }
                retrofitBuilder.client(getOkHttpClient())
                return retrofitBuilder.build()
            }
        } catch (e: Exception) {
            return null
        }
    }

    private fun getOkHttpClient(
    ): OkHttpClient {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        okHttpClientBuilder.connectTimeout(1, TimeUnit.MINUTES)
        okHttpClientBuilder.readTimeout(1, TimeUnit.MINUTES)
        okHttpClientBuilder.addInterceptor(httpLoggingInterceptor)
        return okHttpClientBuilder.build()
    }

    fun with(
        apiBuilder: ApiBuilder
    ): GlobalBuilder = GlobalBuilder(
        apiBuilder
    )

}