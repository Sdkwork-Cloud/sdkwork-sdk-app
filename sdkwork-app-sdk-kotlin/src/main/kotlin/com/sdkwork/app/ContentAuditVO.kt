package com.sdkwork.app

data class ContentAuditVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val contentId: String? = null,
    val overallResult: String? = null,
    val riskLevel: String? = null,
    val results: Map<String, AuditResultItem>? = null,
    val textResult: TextAuditVO? = null,
    val imageResults: List<ImageAuditVO>? = null,
    val videoResult: VideoAuditVO? = null,
    val audioResult: AudioAuditVO? = null,
    val suggestion: String? = null
)
