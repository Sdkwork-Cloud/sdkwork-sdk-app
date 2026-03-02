package com.sdkwork.app

data class NoteSearchRequest(
    val keyword: String? = null,
    val folderId: String? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
