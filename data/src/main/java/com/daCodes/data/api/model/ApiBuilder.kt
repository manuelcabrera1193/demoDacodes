package com.daCodes.data.api.model

class ApiBuilder private constructor(
    var base : String = "",
    var endpoint: String = "",
    var method: MethodHttp = MethodHttp.UNDEFINED,
    var body: Any = "",
    var type: ExecuteType = ExecuteType.COROUTINES,
) {

    data class Builder(
        var base: String = "",
        var endpoint: String = "",
        var method: MethodHttp = MethodHttp.UNDEFINED,
        var body: Any = "",
        var type: ExecuteType = ExecuteType.COROUTINES,
        ) {

        fun base(baseUrl: String?) = apply { this.base = baseUrl.orEmpty() }
        fun endpoint(endpoint: String?) = apply { this.endpoint = endpoint.orEmpty() }
        fun method(method: MethodHttp?) = apply { this.method = method ?: MethodHttp.UNDEFINED }
        fun body(body: Any?) = apply { this.body = body ?: "" }
        fun type(type: ExecuteType?) = apply { this.type = type ?: ExecuteType.COROUTINES }

        fun config() = ApiBuilder(
            base ,
            endpoint,
            method,
            body
        )
    }
}