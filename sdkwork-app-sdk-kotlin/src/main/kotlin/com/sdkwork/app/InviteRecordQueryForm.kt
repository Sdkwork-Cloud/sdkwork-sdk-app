package com.sdkwork.app

data class InviteRecordQueryForm(
    val page: Int? = null,
    val size: Int? = null,
    val status: String? = null,
    val startTime: String? = null,
    val endTime: String? = null
)
