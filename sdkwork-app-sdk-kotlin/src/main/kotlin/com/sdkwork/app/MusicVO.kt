package com.sdkwork.app

data class MusicVO(
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
    val thumbnailUrl: String? = null,
    val status: String? = null,
    val isPublic: Boolean? = null,
    val isFavorite: Boolean? = null,
    val playCount: Int? = null,
    val likeCount: Int? = null
)
