package com.sdkwork.app

data class DocumentListQueryRequest(
    val keyword: String? = null,
    val folderId: String? = null,
    val sortField: String? = null,
    val sortOrder: String? = null,
    val pageNum: Int? = null,
    val pageSize: Int? = null
)
