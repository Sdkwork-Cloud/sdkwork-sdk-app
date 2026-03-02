package com.sdkwork.app

data class MyAuditRecordQueryForm(
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val contentType: String? = null,
    val result: String? = null,
    val startDate: String? = null,
    val endDate: String? = null,
    val size: Int? = null,
    val page: Int? = null
)
