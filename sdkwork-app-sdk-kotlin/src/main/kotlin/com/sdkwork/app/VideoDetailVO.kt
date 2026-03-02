package com.sdkwork.app

data class VideoDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val videoId: String? = null,
    val title: String? = null,
    val description: String? = null,
    val contentUrl: String? = null,
    val format: String? = null,
    val duration: Int? = null,
    val thumbnailUrl: String? = null,
    val width: Int? = null,
    val height: Int? = null,
    val aspectRatio: String? = null,
    val resolution: String? = null,
    val fileSize: Int? = null,
    val categoryId: Int? = null,
    val coverImages: ImageMediaResourceList? = null,
    val resource: VideoMediaResource? = null,
    val author: AuthorInfo? = null,
    val status: String? = null,
    val isPublic: Boolean? = null,
    val isFavorite: Boolean? = null,
    val playCount: Int? = null,
    val downloadCount: Int? = null,
    val likeCount: Int? = null
)
