package com.sdkwork.app

data class FunnelQueryForm(
    val funnelName: String? = null,
    val events: List<String>? = null,
    val startDate: String? = null,
    val endDate: String? = null,
    val deviceType: String? = null,
    val osType: String? = null
)
