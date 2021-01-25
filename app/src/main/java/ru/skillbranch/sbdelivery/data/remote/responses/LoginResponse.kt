package ru.skillbranch.sbdelivery.data.remote.responses

data class LoginResponse(
    val accessToken: String,
    val email: String,
    val firstName: String,
    val id: String,
    val lastName: String,
    val refreshToken: String
)