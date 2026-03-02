package com.sdkwork.app

data class FileSystemNodeListForm(
    val diskId: String? = null,
    val parentId: String? = null,
    val keyword: String? = null,
    val sortField: String? = null,
    val sortOrder: String? = null,
    val pageNum: Int? = null,
    val pageSize: Int? = null
)
