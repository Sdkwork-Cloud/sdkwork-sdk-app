package com.sdkwork.app

data class BatchTextAuditVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val batchId: String? = null,
    val results: List<TextAuditItem>? = null,
    val overallStatus: String? = null,
    val totalCount: Int? = null,
    val passCount: Int? = null,
    val rejectCount: Int? = null
)
