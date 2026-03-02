package com.sdkwork.app

data class FileSystemFolderCreateForm(
    val name: String? = null,
    val parentId: String? = null,
    val diskId: String? = null,
    val description: String? = null,
    val tags: List<String>? = null
)
