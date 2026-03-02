package com.sdkwork.app

data class ActivityDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val title: String? = null,
    val description: String? = null,
    val type: String? = null,
    val coverImage: String? = null,
    val bannerImages: List<String>? = null,
    val rules: String? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val participantCount: Int? = null,
    val hasJoined: Boolean? = null,
    val maxJoinCount: Int? = null,
    val joinedCount: Int? = null,
    val remainingCount: Int? = null,
    val rewards: List<ActivityReward>? = null,
    val extraConfig: Map<String, Any>? = null
)
