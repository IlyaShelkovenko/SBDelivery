package ru.skillbranch.sbdelivery.data.remote.requests

data class RecoverPasswordStepTwoRequest(
    val code: String,
    val email: String
)