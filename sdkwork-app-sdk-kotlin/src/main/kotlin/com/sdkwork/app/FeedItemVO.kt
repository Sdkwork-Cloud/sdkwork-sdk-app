package com.sdkwork.app

data class FeedItemVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val title: String? = null,
    val content: String? = null,
    val summary: String? = null,
    val coverImage: String? = null,
    val contentType: String? = null,
    val tags: List<String>? = null,
    val author: AuthorInfo? = null,
    val viewCount: Int? = null,
    val likeCount: Int? = null,
    val commentCount: Int? = null,
    val shareCount: Int? = null,
    val isLiked: Boolean? = null,
    val isCollected: Boolean? = null
)
