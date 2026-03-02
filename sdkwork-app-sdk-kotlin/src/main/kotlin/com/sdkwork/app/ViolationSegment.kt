package com.sdkwork.app

data class ViolationSegment(
    val startTime: Int? = null,
    val endTime: Int? = null,
    val violationType: String? = null,
    val text: String? = null,
    val confidence: Double? = null
)
