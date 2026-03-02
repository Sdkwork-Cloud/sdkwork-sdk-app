package com.sdkwork.app

data class BrowseHistoryQueryForm(
    val type: String? = null,
    val targetId: String? = null,
    val page: Int? = null,
    val size: Int? = null,
    val sortField: String? = null,
    val sortOrder: String? = null
)
