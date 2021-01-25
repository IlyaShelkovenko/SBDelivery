package ru.skillbranch.sbdelivery.data.remote.requests

data class ChangeFavoriteResponse(
    val dishId: String,
    val favorite: Boolean
)