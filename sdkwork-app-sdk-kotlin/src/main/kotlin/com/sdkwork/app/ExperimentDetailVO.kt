package com.sdkwork.app

data class ExperimentDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val experimentKey: String? = null,
    val experimentName: String? = null,
    val experimentDescription: String? = null,
    val status: String? = null,
    val variants: List<Map<String, Any>>? = null,
    val config: Map<String, Any>? = null
)
