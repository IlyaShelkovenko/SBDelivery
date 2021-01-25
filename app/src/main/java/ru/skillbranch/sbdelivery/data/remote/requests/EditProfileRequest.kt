package ru.skillbranch.sbdelivery.data.remote.requests

data class EditProfileRequest(
    val email: String,
    val firstName: String,
    val lastName: String
)