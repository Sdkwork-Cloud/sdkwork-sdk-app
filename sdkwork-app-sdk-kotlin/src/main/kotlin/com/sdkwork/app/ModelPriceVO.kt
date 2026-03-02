package com.sdkwork.app

data class ModelPriceVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val model: String? = null,
    val unit: String? = null,
    val currency: String? = null,
    val price: Double? = null,
    val inputPrice: Double? = null,
    val outputPrice: Double? = null,
    val batchInputPrice: Double? = null,
    val batchOutputPrice: Double? = null,
    val cachedInputPrice: Double? = null,
    val batchCachedInputPrice: Double? = null
)
