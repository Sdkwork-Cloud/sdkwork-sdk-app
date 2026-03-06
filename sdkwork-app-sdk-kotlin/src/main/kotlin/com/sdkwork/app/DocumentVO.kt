package com.sdkwork.app

data class DocumentVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val documentId: String? = null,
    val documentUuid: String? = null,
    val title: String? = null,
    val folderId: String? = null,
    val assetType: String? = null,
    val mimeType: String? = null,
    val description: String? = null,
    val tags: List<String>? = null,
    val status: String? = null,
    val favorited: Boolean? = null,
    val summary: String? = null,
    val wordCount: Int? = null,
    val charCount: Int? = null
)
