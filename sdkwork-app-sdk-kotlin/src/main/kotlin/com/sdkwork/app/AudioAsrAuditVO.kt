package com.sdkwork.app

data class AudioAsrAuditVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val fullText: String? = null,
    val segments: List<TimestampedSegment>? = null,
    val textAuditResult: TextAuditVO? = null,
    val overallResult: String? = null,
    val language: String? = null
)
