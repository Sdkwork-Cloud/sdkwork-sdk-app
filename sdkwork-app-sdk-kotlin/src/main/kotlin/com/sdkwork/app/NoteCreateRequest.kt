package com.sdkwork.app

data class NoteCreateRequest(
    val title: String? = null,
    val content: String? = null,
    val folderId: String? = null,
    val tags: List<String>? = null
)
