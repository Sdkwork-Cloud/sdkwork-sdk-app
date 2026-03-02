package com.sdkwork.app

data class ActivityRecordQueryForm(
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val activityId: String? = null,
    val recordType: String? = null,
    val size: Int? = null,
    val page: Int? = null
)
