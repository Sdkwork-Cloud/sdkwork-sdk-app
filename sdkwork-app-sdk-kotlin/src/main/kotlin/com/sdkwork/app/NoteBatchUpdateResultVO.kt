package com.sdkwork.app

data class NoteBatchUpdateResultVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val noteId: String? = null,
    val noteUuid: String? = null,
    val versionId: String? = null,
    val appliedCount: Int? = null,
    val skippedCount: Int? = null,
    val charCount: Int? = null,
    val wordCount: Int? = null
)
