package com.sdkwork.app

data class BrowseStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalCount: Int? = null,
    val totalDuration: Int? = null,
    val averageDuration: Int? = null,
    val todayCount: Int? = null,
    val weeklyCount: Int? = null,
    val monthlyCount: Int? = null,
    val typeDistribution: Map<String, Int>? = null,
    val sourceDistribution: Map<String, Int>? = null,
    val dailyTrend: Map<String, Int>? = null
)
