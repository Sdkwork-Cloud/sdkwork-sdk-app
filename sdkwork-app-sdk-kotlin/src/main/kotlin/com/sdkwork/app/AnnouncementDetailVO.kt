package com.sdkwork.app

data class AnnouncementDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val announcementId: String? = null,
    val title: String? = null,
    val content: String? = null,
    val type: String? = null,
    val status: String? = null,
    val author: String? = null,
    val publishTime: String? = null,
    val expireTime: String? = null,
    val viewCount: Int? = null,
    val isTop: Boolean? = null,
    val coverImage: String? = null
)
