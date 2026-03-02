package com.sdkwork.app

data class SkuStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val productId: String? = null,
    val productName: String? = null,
    val totalSkuCount: Int? = null,
    val enabledSkuCount: Int? = null,
    val disabledSkuCount: Int? = null,
    val totalStock: Int? = null,
    val totalSales: Int? = null,
    val averagePrice: Double? = null,
    val warningStockCount: Int? = null,
    val stockTrend: Map<String, Int>? = null,
    val salesTrend: Map<String, Int>? = null
)
