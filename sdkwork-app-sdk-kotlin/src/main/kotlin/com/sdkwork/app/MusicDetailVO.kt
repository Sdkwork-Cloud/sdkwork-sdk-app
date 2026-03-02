package com.sdkwork.app

data class MusicDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val musicId: String? = null,
    val title: String? = null,
    val description: String? = null,
    val contentUrl: String? = null,
    val format: String? = null,
    val duration: Int? = null,
    val artist: String? = null,
    val genre: String? = null,
    val bitrate: Int? = null,
    val fileSize: Int? = null,
    val thumbnailUrl: String? = null,
    val coverImages: ImageMediaResourceList? = null,
    val resource: MusicMediaResource? = null,
    val author: AuthorInfo? = null,
    val status: String? = null,
    val isPublic: Boolean? = null,
    val isFavorite: Boolean? = null,
    val playCount: Int? = null,
    val downloadCount: Int? = null,
    val likeCount: Int? = null
)
