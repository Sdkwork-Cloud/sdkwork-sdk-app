package com.sdkwork.app

data class RealtimeOnlineVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val currentOnline: Int? = null,
    val peakOnline: Int? = null,
    val averageOnline: Int? = null,
    val newUsers: Int? = null,
    val activeUsers: Int? = null,
    val timestamp: String? = null
)
