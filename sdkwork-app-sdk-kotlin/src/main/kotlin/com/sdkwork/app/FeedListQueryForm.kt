package com.sdkwork.app

data class FeedListQueryForm(
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val type: String? = null,
    val contentType: String? = null,
    val keyword: String? = null,
    val authorId: Int? = null,
    val size: Int? = null,
    val page: Int? = null
)
