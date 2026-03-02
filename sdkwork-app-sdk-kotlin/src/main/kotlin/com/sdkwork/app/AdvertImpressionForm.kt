package com.sdkwork.app

data class AdvertImpressionForm(
    val advertId: String? = null,
    val positionId: String? = null,
    val impressionTime: String? = null,
    val deviceId: String? = null,
    val ipAddress: String? = null,
    val userAgent: String? = null,
    val screenSize: String? = null
)
