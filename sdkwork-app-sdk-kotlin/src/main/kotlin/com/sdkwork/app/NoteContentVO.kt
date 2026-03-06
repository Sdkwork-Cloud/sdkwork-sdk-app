package com.sdkwork.app

data class NoteContentVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val noteId: String? = null,
    val noteUuid: String? = null,
    val contentId: String? = null,
    val versionId: String? = null,
    val encoding: String? = null,
    val prompt: String? = null,
    val thinkingContent: String? = null,
    val text: String? = null,
    val contents: Map<String, String>? = null,
    val charCount: Int? = null,
    val wordCount: Int? = null
)
