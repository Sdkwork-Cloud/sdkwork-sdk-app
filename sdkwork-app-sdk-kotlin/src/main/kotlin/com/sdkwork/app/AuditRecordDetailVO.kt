package com.sdkwork.app

data class AuditRecordDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val recordId: String? = null,
    val contentId: String? = null,
    val contentType: String? = null,
    val originalContent: String? = null,
    val processedContent: String? = null,
    val userId: String? = null,
    val result: String? = null,
    val riskLevel: String? = null,
    val confidence: Double? = null,
    val detectionResults: List<DetectionResult>? = null,
    val checkTypes: List<String>? = null,
    val scene: String? = null,
    val deviceInfo: Map<String, Any>? = null,
    val ipAddress: String? = null,
    val location: String? = null,
    val auditTime: String? = null,
    val processTime: Int? = null,
    val hasAppeal: Boolean? = null
)
