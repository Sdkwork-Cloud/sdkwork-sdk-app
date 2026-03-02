package com.sdkwork.app

data class StorageTrendVO(
    val last7Days: Int? = null,
    val last30Days: Int? = null,
    val last90Days: Int? = null,
    val avgDailyGrowth: Int? = null
)
