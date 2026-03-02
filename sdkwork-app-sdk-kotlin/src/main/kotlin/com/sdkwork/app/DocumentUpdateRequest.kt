package com.sdkwork.app

data class DocumentUpdateRequest(
    val title: String? = null,
    val folderId: String? = null,
    val description: String? = null,
    val tags: List<String>? = null
)
