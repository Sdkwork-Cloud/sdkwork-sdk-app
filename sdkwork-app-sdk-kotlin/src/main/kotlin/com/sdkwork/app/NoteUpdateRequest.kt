package com.sdkwork.app

data class NoteUpdateRequest(
    val title: String? = null,
    val content: String? = null,
    val tags: List<String>? = null
)
