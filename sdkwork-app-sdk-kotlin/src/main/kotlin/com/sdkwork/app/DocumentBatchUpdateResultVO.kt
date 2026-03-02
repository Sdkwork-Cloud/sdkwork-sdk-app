package com.sdkwork.app

data class DocumentBatchUpdateResultVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val documentId: String? = null,
    val documentUuid: String? = null,
    val versionId: String? = null,
    val appliedCount: Int? = null,
    val skippedCount: Int? = null,
    val charCount: Int? = null,
    val wordCount: Int? = null
)
