package com.sdkwork.app

data class AuditRecordVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val recordId: String? = null,
    val contentId: String? = null,
    val contentType: String? = null,
    val contentPreview: String? = null,
    val result: String? = null,
    val riskLevel: String? = null,
    val checkTypes: List<String>? = null,
    val violationTypes: List<String>? = null,
    val auditTime: String? = null,
    val processTime: Int? = null
)
