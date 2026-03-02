package com.sdkwork.app

data class TimestampedSegment(
    val startTime: Int? = null,
    val endTime: Int? = null,
    val text: String? = null,
    val speakerId: Int? = null,
    val confidence: Double? = null
)
