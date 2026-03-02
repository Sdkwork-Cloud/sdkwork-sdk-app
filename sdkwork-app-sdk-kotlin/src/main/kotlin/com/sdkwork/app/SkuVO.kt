package com.sdkwork.app

data class SkuVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val productId: String? = null,
    val skuCode: String? = null,
    val skuName: String? = null,
    val attributes: Map<String, String>? = null,
    val price: Double? = null,
    val originalPrice: Double? = null,
    val stock: Int? = null,
    val sales: Int? = null,
    val image: String? = null,
    val status: String? = null,
    val sort: Int? = null
)
