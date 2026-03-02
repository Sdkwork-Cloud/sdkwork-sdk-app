package com.sdkwork.app

data class VideoAuditVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val status: String? = null,
    val videoUrl: String? = null,
    val duration: Int? = null,
    val result: String? = null,
    val riskLevel: String? = null,
    val keyFrameResults: List<KeyFrameResult>? = null,
    val audioResult: AudioAuditVO? = null,
    val suggestion: String? = null
)
