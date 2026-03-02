package com.sdkwork.app

data class OrderCreateForm(
    val orderType: String? = null,
    val productId: String? = null,
    val quantity: Int? = null,
    val items: List<OrderItemForm>? = null,
    val addressId: String? = null,
    val paymentMethod: String? = null,
    val couponId: String? = null,
    val remark: String? = null,
    val sourceChannel: String? = null,
    val rechargePoints: Int? = null
)
