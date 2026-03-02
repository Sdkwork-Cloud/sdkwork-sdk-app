package com.sdkwork.app

data class UserActivityQueryForm(
    val startDate: String? = null,
    val endDate: String? = null,
    val activityType: String? = null,
    val userId: String? = null,
    val pageSize: Int? = null,
    val pageNum: Int? = null
)
