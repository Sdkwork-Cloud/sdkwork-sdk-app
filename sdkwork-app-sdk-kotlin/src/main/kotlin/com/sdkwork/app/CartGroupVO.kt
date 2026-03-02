package com.sdkwork.app

data class CartGroupVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val uuid: String? = null,
    val name: String? = null,
    val items: List<CartItemVO>? = null,
    val totalQuantity: Int? = null,
    val totalPrice: Double? = null
)
