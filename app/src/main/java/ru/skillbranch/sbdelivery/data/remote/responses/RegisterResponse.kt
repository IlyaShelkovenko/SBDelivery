package ru.skillbranch.sbdelivery.data.remote.responses

data class RegisterResponse(
    val accessToken: String,
    val email: String,
    val firstName: String,
    val id: String,
    val lastName: String,
    val refreshToken: String
)