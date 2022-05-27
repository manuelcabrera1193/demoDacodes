package com.daCodes.data.api.interactor

import com.daCodes.data.api.model.ApiBuilder
import com.daCodes.data.api.model.Result
import io.reactivex.Single
import retrofit2.Response

enum class EnumPayloadCoroutine {

    GET {
        override suspend fun execute(apiBuilder: ApiBuilder): Result {
            return executeCoroutine(
                payload().payloadCoroutine(apiBuilder)
            )
        }
    },
    POST {
        override suspend fun execute(apiBuilder: ApiBuilder): Result {
            return executeCoroutine(
                payload().payloadCoroutine(apiBuilder)
            )
        }
    },
    PUT {
        override suspend fun execute(apiBuilder: ApiBuilder): Result {
            return executeCoroutine(
                payload().payloadCoroutine(apiBuilder)
            )
        }
    },
    PATCH {
        override suspend fun execute(apiBuilder: ApiBuilder): Result {
            return executeCoroutine(
                payload().payloadCoroutine(apiBuilder)
            )
        }
    },
    DELETE {
        override suspend fun execute(apiBuilder: ApiBuilder): Result {
            return executeCoroutine(
                payload().payloadCoroutine(apiBuilder)
            )
        }
    },
    UNDEFINED {
        override suspend fun execute(apiBuilder: ApiBuilder): Result {
            return executeCoroutine(
                payload().payloadCoroutine(apiBuilder)
            )
        }
    };

    @Throws(Throwable::class)
    internal abstract suspend fun execute(apiBuilder: ApiBuilder): Result

    @Throws(Throwable::class)
    protected fun payload(): IPayload {
        return Payload()
    }
}


enum class EnumPayloadRx {

    GET {
        override fun execute(apiBuilder: ApiBuilder): Single<Response<Any>> {
            return executeRx(
                payload().payloadRx(apiBuilder)
            )
        }
    },
    POST {
        override fun execute(apiBuilder: ApiBuilder): Single<Response<Any>> {
            return executeRx(
                payload().payloadRx(apiBuilder)
            )
        }
    },
    PUT {
        override fun execute(apiBuilder: ApiBuilder): Single<Response<Any>> {
            return executeRx(
                payload().payloadRx(apiBuilder)
            )
        }
    },
    PATCH {
        override fun execute(apiBuilder: ApiBuilder): Single<Response<Any>> {
            return executeRx(
                payload().payloadRx(apiBuilder)
            )
        }
    },
    DELETE {
        override fun execute(apiBuilder: ApiBuilder): Single<Response<Any>> {
            return executeRx(
                payload().payloadRx(apiBuilder)
            )
        }
    },
    UNDEFINED {
        override fun execute(apiBuilder: ApiBuilder): Single<Response<Any>> {
            return executeRx(
                payload().payloadRx(apiBuilder)
            )
        }
    };

    @Throws(Throwable::class)
    internal abstract fun execute(apiBuilder: ApiBuilder): Single<Response<Any>>

    @Throws(Throwable::class)
    protected fun payload(): IPayload {
        return Payload()
    }
}