package com.sdkwork.app

data class ExperimentResultsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val experimentKey: String? = null,
    val results: List<Map<String, Any>>? = null,
    val statistics: Map<String, Any>? = null,
    val status: String? = null,
    val generatedAt: String? = null
)
