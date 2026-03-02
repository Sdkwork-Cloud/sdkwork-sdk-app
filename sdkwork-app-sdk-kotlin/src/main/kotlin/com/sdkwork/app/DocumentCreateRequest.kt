package com.sdkwork.app

data class DocumentCreateRequest(
    val title: String? = null,
    val content: String? = null,
    val folderId: String? = null,
    val diskId: String? = null,
    val description: String? = null,
    val mimeType: String? = null,
    val tags: List<String>? = null
)
