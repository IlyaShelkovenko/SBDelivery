package ru.skillbranch.sbdelivery.data.remote.requests

data class RegisterRequest(
    val email: String,
    val firstName: String,
    val lastName: String,
    val password: String
)