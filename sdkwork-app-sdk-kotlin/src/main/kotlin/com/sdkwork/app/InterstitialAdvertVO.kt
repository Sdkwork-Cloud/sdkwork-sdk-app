package com.sdkwork.app

data class InterstitialAdvertVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val advertId: String? = null,
    val advertName: String? = null,
    val advertType: String? = null,
    val positionId: String? = null,
    val creativeUrl: String? = null,
    val landingUrl: String? = null,
    val priority: Int? = null,
    val enabled: Boolean? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val clickCount: Int? = null,
    val impressionCount: Int? = null,
    val interstitialSize: String? = null,
    val displayTime: Int? = null,
    val skipEnabled: Boolean? = null,
    val skipDelay: Int? = null
)
