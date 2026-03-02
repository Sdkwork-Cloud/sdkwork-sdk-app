package com.sdkwork.app

data class PaymentQueryForm(
    val paymentOrderId: String? = null,
    val merchantOrderId: String? = null,
    val queryType: String? = null,
    val status: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
