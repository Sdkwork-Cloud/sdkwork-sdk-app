package com.sdkwork.app

data class NoteListQueryRequest(
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortField: String? = null,
    val sortOrder: String? = null,
    val folderId: String? = null,
    val diskId: String? = null,
    val keyword: String? = null,
    val includeArchived: Boolean? = null,
    val includeDeleted: Boolean? = null,
    val favoriteOnly: Boolean? = null
)
