package com.sdkwork.app

data class UserUsageStatsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val statsId: String? = null,
    val userId: String? = null,
    val totalSessions: Int? = null,
    val totalDuration: Int? = null,
    val activeDays: Int? = null,
    val lastActiveDays: Int? = null,
    val deviceType: String? = null,
    val osType: String? = null,
    val firstSeen: String? = null,
    val lastSeen: String? = null,
    val userType: String? = null
)
