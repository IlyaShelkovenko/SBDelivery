package ru.skillbranch.sbdelivery.data.remote.responses

data class FavoriteDishResponse(
    val dishId: String,
    val favorite: Boolean,
    val updatedAt: Long
)