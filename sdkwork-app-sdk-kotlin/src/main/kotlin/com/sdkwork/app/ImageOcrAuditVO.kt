package com.sdkwork.app

data class ImageOcrAuditVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val ocrText: String? = null,
    val textBlocks: List<TextBlock>? = null,
    val textAuditResult: TextAuditVO? = null,
    val overallResult: String? = null
)
