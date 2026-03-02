package com.sdkwork.app

data class ProjectListQueryRequest(
    val keyword: String? = null,
    val workspaceId: String? = null,
    val type: String? = null,
    val status: String? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
