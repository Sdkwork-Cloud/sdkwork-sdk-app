package com.sdkwork.app

data class RetentionAnalysisVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val retentionType: String? = null,
    val retentionRates: Map<String, Double>? = null,
    val averageRetentionRate: Double? = null,
    val totalUsers: Int? = null,
    val cohortSizes: Map<String, Int>? = null
)
