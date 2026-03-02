package com.sdkwork.app

data class ProjectSearchRequest(
    val keyword: String? = null,
    val workspaceId: String? = null,
    val type: String? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
