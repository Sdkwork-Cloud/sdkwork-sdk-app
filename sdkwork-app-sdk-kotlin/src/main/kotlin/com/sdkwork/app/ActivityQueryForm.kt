package com.sdkwork.app

data class ActivityQueryForm(
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val type: String? = null,
    val status: String? = null,
    val size: Int? = null,
    val page: Int? = null
)
