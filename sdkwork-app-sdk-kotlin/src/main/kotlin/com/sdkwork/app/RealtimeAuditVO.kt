package com.sdkwork.app

data class RealtimeAuditVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val streamId: String? = null,
    val taskId: String? = null,
    val status: String? = null,
    val videoEnabled: Boolean? = null,
    val audioEnabled: Boolean? = null,
    val pushUrl: String? = null,
    val startTime: String? = null,
    val estimatedEndTime: String? = null
)
