package com.sdkwork.app

data class OrderListQueryForm(
    val page: Int? = null,
    val size: Int? = null,
    val status: String? = null,
    val orderType: String? = null,
    val keyword: String? = null,
    val startTime: String? = null,
    val endTime: String? = null
)
