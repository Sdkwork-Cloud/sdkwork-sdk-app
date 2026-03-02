package com.sdkwork.app

data class FileSystemContentVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val nodeId: String? = null,
    val nodeUuid: String? = null,
    val contentId: String? = null,
    val fileVersion: String? = null,
    val encoding: String? = null,
    val prompt: String? = null,
    val thinkingContent: String? = null,
    val text: String? = null,
    val contents: Map<String, String>? = null,
    val charCount: Int? = null,
    val wordCount: Int? = null
)
