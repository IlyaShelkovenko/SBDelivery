package ru.skillbranch.sbdelivery.data.remote.requests

data class AddReviewRequest(
    val rating: Int,
    val text: String
)