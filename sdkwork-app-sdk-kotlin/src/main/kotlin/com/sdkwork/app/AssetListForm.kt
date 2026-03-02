package com.sdkwork.app

data class AssetListForm(
    val type: String? = null,
    val folderId: String? = null,
    val keyword: String? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val pageNum: Int? = null,
    val pageSize: Int? = null
)
