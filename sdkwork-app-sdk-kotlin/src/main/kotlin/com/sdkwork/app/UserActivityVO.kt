package com.sdkwork.app

data class UserActivityVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val activityId: String? = null,
    val userId: String? = null,
    val activityType: String? = null,
    val activityName: String? = null,
    val timestamp: String? = null,
    val deviceId: String? = null,
    val ipAddress: String? = null,
    val pageUrl: String? = null,
    val referrer: String? = null
)
