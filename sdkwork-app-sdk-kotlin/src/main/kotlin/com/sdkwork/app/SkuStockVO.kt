package com.sdkwork.app

data class SkuStockVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val skuId: String? = null,
    val productId: String? = null,
    val skuCode: String? = null,
    val skuName: String? = null,
    val quantity: Int? = null,
    val warningStock: Int? = null,
    val lockedStock: Int? = null,
    val availableStock: Int? = null,
    val status: String? = null
)
