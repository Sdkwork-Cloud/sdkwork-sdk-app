package com.sdkwork.app

data class TutorialVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val title: String? = null,
    val description: String? = null,
    val categoryId: String? = null,
    val categoryName: String? = null,
    val viewCount: Int? = null,
    val likeCount: Int? = null,
    val coverImage: String? = null
)
