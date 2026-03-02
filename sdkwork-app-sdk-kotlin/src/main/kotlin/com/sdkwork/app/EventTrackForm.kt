package com.sdkwork.app

data class EventTrackForm(
    val eventName: String? = null,
    val eventType: String? = null,
    val timestamp: String? = null,
    val deviceId: String? = null,
    val userId: String? = null,
    val properties: Map<String, Any>? = null,
    val sessionId: String? = null,
    val pageUrl: String? = null,
    val referrer: String? = null
)
