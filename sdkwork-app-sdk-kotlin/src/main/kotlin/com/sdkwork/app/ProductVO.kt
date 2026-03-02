package com.sdkwork.app

data class ProductVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val title: String? = null,
    val type: String? = null,
    val summary: String? = null,
    val mainImage: String? = null,
    val price: Double? = null,
    val originalPrice: Double? = null,
    val sales: Int? = null,
    val status: String? = null,
    val recommended: Boolean? = null,
    val hot: Boolean? = null,
    val categoryName: String? = null,
    val brandName: String? = null,
    val tags: List<String>? = null
)
