package com.sdkwork.app

data class ConversionPathVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val pathId: String? = null,
    val steps: List<String>? = null,
    val conversionCount: Int? = null,
    val conversionRate: Double? = null,
    val averageTime: Double? = null,
    val startPage: String? = null,
    val endPage: String? = null
)
