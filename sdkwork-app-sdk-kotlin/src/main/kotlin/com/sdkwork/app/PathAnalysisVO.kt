package com.sdkwork.app

data class PathAnalysisVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val startPage: String? = null,
    val endPage: String? = null,
    val steps: List<PathStepVO>? = null,
    val totalUsers: Int? = null,
    val averageSteps: Double? = null,
    val conversionRate: Double? = null
)
