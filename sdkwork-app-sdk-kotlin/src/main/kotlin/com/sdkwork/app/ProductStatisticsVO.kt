package com.sdkwork.app

data class ProductStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val productId: String? = null,
    val totalSales: Int? = null,
    val totalStock: Int? = null,
    val reviewCount: Int? = null,
    val averageRating: Double? = null,
    val viewCount: Int? = null,
    val favoriteCount: Int? = null,
    val shareCount: Int? = null,
    val salesTrend: Map<String, Int>? = null,
    val stockTrend: Map<String, Int>? = null
)
