package com.sdkwork.app

data class PaymentStatusVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val paymentOrderId: String? = null,
    val merchantOrderId: String? = null,
    val status: String? = null,
    val statusName: String? = null,
    val amount: String? = null,
    val payTime: Int? = null,
    val paymentMethod: String? = null,
    val paymentId: Int? = null,
    val paymentSn: String? = null,
    val orderId: Int? = null,
    val paymentProvider: String? = null,
    val transactionId: String? = null,
    val outTradeNo: String? = null,
    val successTime: String? = null
)
