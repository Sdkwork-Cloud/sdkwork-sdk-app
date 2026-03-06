package com.sdkwork.app

data class PaymentParamsVO(
    val orderId: String? = null,
    val paymentId: String? = null,
    val outTradeNo: String? = null,
    val amount: String? = null,
    val paymentMethod: String? = null,
    val paymentParams: Map<String, Any>? = null
)
