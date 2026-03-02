package com.sdkwork.app

data class RealtimeAuditForm(
    val streamId: String? = null,
    val streamUrl: String? = null,
    val streamType: String? = null,
    val roomId: String? = null,
    val publisherId: String? = null,
    val checkTypes: List<String>? = null,
    val callbackUrl: String? = null,
    val checkAudio: Boolean? = null,
    val checkVideo: Boolean? = null
)
