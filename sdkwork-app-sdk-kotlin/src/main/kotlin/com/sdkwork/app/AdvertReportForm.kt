package com.sdkwork.app

data class AdvertReportForm(
    val advertId: String? = null,
    val reportType: String? = null,
    val reason: String? = null,
    val screenshotUrl: String? = null,
    val deviceId: String? = null,
    val ipAddress: String? = null
)
