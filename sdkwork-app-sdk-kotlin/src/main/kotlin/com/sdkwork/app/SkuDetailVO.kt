package com.sdkwork.app

data class SkuDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val productId: String? = null,
    val productName: String? = null,
    val skuCode: String? = null,
    val skuName: String? = null,
    val attributes: Map<String, String>? = null,
    val price: Double? = null,
    val originalPrice: Double? = null,
    val stock: Int? = null,
    val warningStock: Int? = null,
    val sales: Int? = null,
    val mainImage: String? = null,
    val images: List<String>? = null,
    val weight: Double? = null,
    val volume: Double? = null,
    val status: String? = null,
    val sort: Int? = null
)
