package com.sdkwork.app

data class ShareTrackForm(
    val shareId: String? = null,
    val trackType: String? = null,
    val userAgent: String? = null,
    val ipAddress: String? = null,
    val deviceInfo: String? = null
)
