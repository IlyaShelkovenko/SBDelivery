package ru.skillbranch.sbdelivery.data.remote.responses

data class DishesResponse(
    val active: Boolean,
    val category: String,
    val commentsCount: Int,
    val createdAt: Long,
    val description: String,
    val id: String,
    val image: String,
    val likes: Int,
    val name: String,
    val oldPrice: Int,
    val price: Int,
    val rating: Double,
    val updatedAt: Long
)