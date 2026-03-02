package com.sdkwork.app

data class ImageVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val imageId: String? = null,
    val title: String? = null,
    val description: String? = null,
    val url: String? = null,
    val format: String? = null,
    val width: Int? = null,
    val height: Int? = null,
    val aspectRatio: String? = null,
    val status: String? = null,
    val isPublic: Boolean? = null,
    val isFavorite: Boolean? = null,
    val viewCount: Int? = null,
    val likeCount: Int? = null
)
