package com.sdkwork.app

data class EventTrendVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val eventName: String? = null,
    val timePoints: List<String>? = null,
    val values: List<Int>? = null,
    val totalCount: Int? = null,
    val growthRate: Double? = null,
    val interval: String? = null
)
