package com.sdkwork.app

data class DetectionResult(
    val type: String? = null,
    val hit: Boolean? = null,
    val confidence: Double? = null,
    val keywords: List<String>? = null
)
