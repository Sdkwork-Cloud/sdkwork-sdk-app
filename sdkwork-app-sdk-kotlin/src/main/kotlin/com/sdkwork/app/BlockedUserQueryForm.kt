package com.sdkwork.app

data class BlockedUserQueryForm(
    val page: Int? = null,
    val size: Int? = null,
    val keyword: String? = null,
    val startTime: String? = null,
    val endTime: String? = null
)
