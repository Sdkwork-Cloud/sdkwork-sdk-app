package com.sdkwork.app

data class DriveItemListForm(
    val keyword: String? = null,
    val assetType: String? = null,
    val folderId: String? = null,
    val diskId: String? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val pageNum: Int? = null,
    val pageSize: Int? = null
)
