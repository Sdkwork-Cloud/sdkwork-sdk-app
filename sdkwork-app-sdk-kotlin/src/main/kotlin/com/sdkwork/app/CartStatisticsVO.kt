package com.sdkwork.app

data class CartStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val cartId: String? = null,
    val itemCount: Int? = null,
    val totalQuantity: Int? = null,
    val totalPrice: Double? = null,
    val selectedItemCount: Int? = null,
    val selectedQuantity: Int? = null,
    val selectedPrice: Double? = null
)
