package ru.skillbranch.sbdelivery.data.remote.requests

data class ChangePasswordRequest(
    val newPassword: String,
    val oldPassword: String
)