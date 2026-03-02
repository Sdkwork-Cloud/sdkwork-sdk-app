package com.sdkwork.app

data class BatchEventTrackForm(
    val events: List<EventTrackForm>? = null,
    val deviceId: String? = null,
    val userId: String? = null,
    val submitTime: String? = null
)
