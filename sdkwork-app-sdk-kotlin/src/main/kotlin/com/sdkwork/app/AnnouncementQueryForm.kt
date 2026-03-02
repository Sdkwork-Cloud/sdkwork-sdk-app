package com.sdkwork.app

data class AnnouncementQueryForm(
    val type: String? = null,
    val status: String? = null,
    val pageSize: Int? = null,
    val pageNum: Int? = null
)
