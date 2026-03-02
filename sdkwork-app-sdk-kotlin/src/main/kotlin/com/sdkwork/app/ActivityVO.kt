package com.sdkwork.app

data class ActivityVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val title: String? = null,
    val subtitle: String? = null,
    val type: String? = null,
    val coverImage: String? = null,
    val status: String? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val hasJoined: Boolean? = null,
    val maxJoinCount: Int? = null,
    val joinedCount: Int? = null,
    val tags: List<String>? = null
)
