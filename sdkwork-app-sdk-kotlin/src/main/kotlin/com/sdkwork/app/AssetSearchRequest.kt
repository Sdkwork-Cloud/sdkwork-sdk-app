package com.sdkwork.app

data class AssetSearchRequest(
    val keyword: String? = null,
    val type: String? = null,
    val workspaceId: String? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
