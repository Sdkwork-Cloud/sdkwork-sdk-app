package com.sdkwork.app

data class BatchImageAuditVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val batchId: String? = null,
    val results: List<ImageAuditItem>? = null,
    val overallStatus: String? = null,
    val totalCount: Int? = null,
    val passCount: Int? = null,
    val rejectCount: Int? = null
)
