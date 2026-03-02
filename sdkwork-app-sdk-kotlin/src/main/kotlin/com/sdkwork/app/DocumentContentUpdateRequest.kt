package com.sdkwork.app

data class DocumentContentUpdateRequest(
    val text: String? = null,
    val contents: Map<String, String>? = null,
    val prompt: String? = null,
    val thinkingContent: String? = null,
    val encoding: String? = null
)
