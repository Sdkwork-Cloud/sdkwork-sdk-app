package com.sdkwork.app

data class FileSystemFileCreateForm(
    val name: String? = null,
    val parentId: String? = null,
    val diskId: String? = null,
    val mimeType: String? = null,
    val assetType: String? = null,
    val description: String? = null,
    val tags: List<String>? = null,
    val text: String? = null,
    val contents: Map<String, String>? = null,
    val prompt: String? = null,
    val thinkingContent: String? = null,
    val encoding: String? = null
)
