package com.sdkwork.app

data class GenerationHistoryQueryForm(
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val generationType: String? = null,
    val status: String? = null,
    val keyword: String? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val size: Int? = null,
    val page: Int? = null
)
