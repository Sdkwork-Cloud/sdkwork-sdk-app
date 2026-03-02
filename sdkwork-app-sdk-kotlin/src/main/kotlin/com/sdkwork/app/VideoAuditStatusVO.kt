package com.sdkwork.app

data class VideoAuditStatusVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val status: String? = null,
    val progress: Int? = null,
    val processedDuration: Int? = null,
    val totalDuration: Int? = null,
    val detections: List<FrameDetection>? = null,
    val estimatedCompleteTime: String? = null
)
