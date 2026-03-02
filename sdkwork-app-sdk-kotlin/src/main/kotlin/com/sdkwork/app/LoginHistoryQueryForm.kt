package com.sdkwork.app

data class LoginHistoryQueryForm(
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val loginType: String? = null,
    val deviceType: String? = null,
    val status: String? = null,
    val ipAddress: String? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val size: Int? = null,
    val page: Int? = null
)
