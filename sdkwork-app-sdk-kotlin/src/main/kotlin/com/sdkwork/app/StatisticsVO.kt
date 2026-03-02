package com.sdkwork.app

data class StatisticsVO(
    val totalProjects: Int? = null,
    val totalGenerations: Int? = null,
    val totalUsageTime: Int? = null,
    val storage: StorageStatisticsVO? = null,
    val dailyUsage: DailyUsageVO? = null
)
