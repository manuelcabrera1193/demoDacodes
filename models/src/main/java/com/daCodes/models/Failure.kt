package com.daCodes.models

sealed class Failure {
    object Server : Failure()
    object Http : Failure()
    object UnExpected : Failure()
    object UnAuthorized : Failure()
    data class Error(val error: ErrorModel) : Failure()
}