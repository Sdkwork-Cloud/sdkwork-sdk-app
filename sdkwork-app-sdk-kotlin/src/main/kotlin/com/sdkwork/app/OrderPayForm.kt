package com.sdkwork.app

data class OrderPayForm(
    val orderId: String? = null,
    val paymentMethod: String? = null,
    val amount: String? = null,
    val paymentPassword: String? = null,
    val clientIp: String? = null
)
