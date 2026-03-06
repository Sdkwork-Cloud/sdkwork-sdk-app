package com.sdkwork.app

data class NoteFolderCreateRequest(
    val name: String? = null,
    val parentId: String? = null,
    val diskId: String? = null
)
