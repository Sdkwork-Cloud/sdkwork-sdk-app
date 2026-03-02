package com.sdkwork.app

data class EventTrendQueryForm(
    val eventName: String? = null,
    val startDate: String? = null,
    val endDate: String? = null,
    val interval: String? = null,
    val deviceType: String? = null,
    val osType: String? = null,
    val channel: String? = null
)
