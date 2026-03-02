package com.sdkwork.app

data class UsageStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val todayUsage: Int? = null,
    val weekUsage: Int? = null,
    val monthUsage: Int? = null,
    val totalUsage: Int? = null,
    val avgDailyUsage: Double? = null,
    val maxDailyUsage: Int? = null,
    val frequency: UsageFrequencyVO? = null,
    val timeDistribution: UsageTimeDistributionVO? = null
)
