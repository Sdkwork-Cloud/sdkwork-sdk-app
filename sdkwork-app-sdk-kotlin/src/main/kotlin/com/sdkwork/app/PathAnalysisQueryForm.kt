package com.sdkwork.app

data class PathAnalysisQueryForm(
    val startDate: String? = null,
    val endDate: String? = null,
    val startPage: String? = null,
    val endPage: String? = null,
    val maxSteps: Int? = null,
    val deviceType: String? = null,
    val osType: String? = null
)
