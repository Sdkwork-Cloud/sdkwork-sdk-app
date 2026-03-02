package com.sdkwork.app

data class NoteListQueryRequest(
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortField: String? = null,
    val sortOrder: String? = null,
    val folderId: String? = null,
    val keyword: String? = null
)
