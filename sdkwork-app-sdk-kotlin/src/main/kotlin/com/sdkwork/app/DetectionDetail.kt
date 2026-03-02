package com.sdkwork.app

data class DetectionDetail(
    val type: String? = null,
    val hit: Boolean? = null,
    val confidence: Double? = null,
    val keywords: List<String>? = null
)
