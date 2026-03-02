package com.sdkwork.app

data class PaymentCreateForm(
    val orderId: String? = null,
    val businessType: String? = null,
    val businessOrderId: String? = null,
    val amount: String? = null,
    val paymentMethod: String? = null,
    val paymentScene: String? = null,
    val clientIp: String? = null,
    val paymentProvider: String? = null,
    val productType: String? = null
)
