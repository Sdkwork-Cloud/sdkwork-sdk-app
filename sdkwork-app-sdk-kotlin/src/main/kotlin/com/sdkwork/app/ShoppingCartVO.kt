package com.sdkwork.app

data class ShoppingCartVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val cartId: String? = null,
    val uuid: String? = null,
    val name: String? = null,
    val description: String? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val status: String? = null,
    val groups: List<CartGroupVO>? = null,
    val totalQuantity: Int? = null,
    val totalPrice: Double? = null,
    val selectedQuantity: Int? = null,
    val selectedPrice: Double? = null
)
