package com.sdkwork.app

data class OrderPaymentSuccessVO(
    val orderId: String? = null,
    val outTradeNo: String? = null,
    val paid: Boolean? = null,
    val status: String? = null,
    val statusName: String? = null
)
