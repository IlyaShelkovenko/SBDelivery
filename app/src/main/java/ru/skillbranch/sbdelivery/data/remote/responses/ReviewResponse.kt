package ru.skillbranch.sbdelivery.data.remote.responses

data class ReviewResponse(
    val active: Boolean,
    val author: String,
    val createdAt: Long,
    val date: String,
    val id: String,
    val rating: Int,
    val text: String,
    val updatedAt: Long
)