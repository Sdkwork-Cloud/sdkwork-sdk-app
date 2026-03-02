package com.sdkwork.app

data class FaqVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val question: String? = null,
    val categoryId: String? = null,
    val categoryName: String? = null,
    val viewCount: Int? = null,
    val helpfulCount: Int? = null
)
