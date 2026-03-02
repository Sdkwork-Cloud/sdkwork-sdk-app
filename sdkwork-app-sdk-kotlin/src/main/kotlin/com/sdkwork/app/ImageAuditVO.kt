package com.sdkwork.app

data class ImageAuditVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val result: String? = null,
    val riskLevel: String? = null,
    val confidence: Double? = null,
    val details: List<ImageDetectionDetail>? = null,
    val violationRegions: List<Region>? = null,
    val suggestion: String? = null
)
