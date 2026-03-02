package com.sdkwork.app

data class ExperimentReportVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val experimentKey: String? = null,
    val reportType: String? = null,
    val reportData: Map<String, Any>? = null,
    val generatedAt: String? = null,
    val version: String? = null
)
