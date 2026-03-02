package com.sdkwork.app

data class ChannelAnalysisVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val channelId: String? = null,
    val channelName: String? = null,
    val channelType: String? = null,
    val clickCount: Int? = null,
    val installCount: Int? = null,
    val activeCount: Int? = null,
    val conversionRate: Double? = null,
    val costPerInstall: Double? = null,
    val roi: Double? = null
)
