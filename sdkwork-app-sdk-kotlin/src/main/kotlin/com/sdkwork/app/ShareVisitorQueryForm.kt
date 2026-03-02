package com.sdkwork.app

data class ShareVisitorQueryForm(
    val shareId: String? = null,
    val page: Int? = null,
    val size: Int? = null,
    val startTime: String? = null,
    val endTime: String? = null
)
