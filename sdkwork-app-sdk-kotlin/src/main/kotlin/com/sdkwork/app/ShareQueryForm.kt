package com.sdkwork.app

data class ShareQueryForm(
    val page: Int? = null,
    val size: Int? = null,
    val shareType: String? = null,
    val status: String? = null,
    val keyword: String? = null,
    val startTime: String? = null,
    val endTime: String? = null
)
