package com.sdkwork.app

data class FolderVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val folderId: String? = null,
    val folderName: String? = null,
    val parentId: String? = null,
    val childCount: Int? = null,
    val fileCount: Int? = null
)
