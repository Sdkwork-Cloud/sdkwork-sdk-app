package com.sdkwork.app

data class ChannelQueryForm(
    val startDate: String? = null,
    val endDate: String? = null,
    val channelType: String? = null,
    val deviceType: String? = null,
    val pageSize: Int? = null,
    val pageNum: Int? = null
)
