package com.sdkwork.app

data class NoteFolderVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val name: String? = null,
    val parentId: Int? = null,
    val parentName: String? = null,
    val path: String? = null,
    val subFolderCount: Int? = null,
    val noteCount: Int? = null,
    val children: List<NoteFolderVO>? = null
)
