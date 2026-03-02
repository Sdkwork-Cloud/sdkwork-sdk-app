package com.sdkwork.app

data class StatsExportForm(
    val reportType: String? = null,
    val startDate: String? = null,
    val endDate: String? = null,
    val format: String? = null,
    val email: String? = null,
    val deviceType: String? = null,
    val osType: String? = null
)
