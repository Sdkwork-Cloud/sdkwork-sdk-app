package com.sdkwork.app

data class EventStatsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val eventName: String? = null,
    val totalCount: Int? = null,
    val averagePerUser: Double? = null,
    val hourlyStats: Map<String, Int>? = null,
    val dailyStats: Map<String, Int>? = null,
    val topProperties: Map<String, Any>? = null
)
