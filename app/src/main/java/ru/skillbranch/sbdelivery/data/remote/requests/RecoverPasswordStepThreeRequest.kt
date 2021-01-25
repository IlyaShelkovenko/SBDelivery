package ru.skillbranch.sbdelivery.data.remote.requests

data class RecoverPasswordStepThreeRequest(
    val code: String,
    val email: String,
    val password: String
)