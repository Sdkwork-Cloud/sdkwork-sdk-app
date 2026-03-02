package com.sdkwork.app

data class TextAuditVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val result: String? = null,
    val riskLevel: String? = null,
    val confidence: Double? = null,
    val details: List<DetectionDetail>? = null,
    val sensitiveWords: List<String>? = null,
    val suggestion: String? = null,
    val processedText: String? = null
)
