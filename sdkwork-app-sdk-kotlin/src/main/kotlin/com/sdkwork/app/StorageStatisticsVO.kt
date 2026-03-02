package com.sdkwork.app

data class StorageStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalStorage: Int? = null,
    val usedStorage: Int? = null,
    val remainingStorage: Int? = null,
    val usageRate: Double? = null,
    val typeDistribution: StorageTypeDistributionVO? = null,
    val trend: StorageTrendVO? = null
)
