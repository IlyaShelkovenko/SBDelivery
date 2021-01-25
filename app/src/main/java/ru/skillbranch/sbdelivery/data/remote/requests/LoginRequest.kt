package ru.skillbranch.sbdelivery.data.remote.requests

data class LoginRequest(
    val email: String,
    val password: String
)