package com.sdkwork.app

data class PageViewTrackForm(
    val pageUrl: String? = null,
    val pageTitle: String? = null,
    val referrer: String? = null,
    val timestamp: String? = null,
    val deviceId: String? = null,
    val userId: String? = null,
    val properties: Map<String, Any>? = null,
    val sessionId: String? = null,
    val duration: Int? = null
)
