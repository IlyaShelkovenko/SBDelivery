package ru.skillbranch.sbdelivery.data.remote.responses

data class CategoriesResponse(
    val active: Boolean,
    val createdAt: Long,
    val icon: String,
    val id: String,
    val name: String,
    val order: Int,
    val parent: Int,
    val updatedAt: Long
)