package com.sdkwork.app

data class FunnelAnalysisVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val funnelName: String? = null,
    val steps: List<FunnelStepVO>? = null,
    val overallConversionRate: Double? = null,
    val totalUsers: Int? = null,
    val convertedUsers: Int? = null
)
