package com.sdkwork.app

data class CartItemVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val itemId: String? = null,
    val uuid: String? = null,
    val cartId: String? = null,
    val cartGroupUuid: String? = null,
    val productId: String? = null,
    val skuId: String? = null,
    val skuName: String? = null,
    val skuCode: String? = null,
    val skuImage: String? = null,
    val skuPrice: Double? = null,
    val quantity: Int? = null,
    val price: Double? = null,
    val totalPrice: Double? = null,
    val selected: Boolean? = null
)
