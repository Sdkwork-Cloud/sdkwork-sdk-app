package com.sdkwork.app

data class ShareStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalShares: Int? = null,
    val totalVisits: Int? = null,
    val todayShares: Int? = null,
    val todayVisits: Int? = null,
    val successRate: String? = null
)
