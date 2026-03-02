package com.sdkwork.app

data class OrderItemForm(
    val productId: String? = null,
    val quantity: Int? = null,
    val price: String? = null,
    val productName: String? = null
)
