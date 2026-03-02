package com.sdkwork.app

data class AudioAuditVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val result: String? = null,
    val riskLevel: String? = null,
    val duration: Int? = null,
    val transcript: String? = null,
    val violationSegments: List<ViolationSegment>? = null,
    val suggestion: String? = null
)
