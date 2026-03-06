package com.sdkwork.app

data class PaymentReconcileForm(
    val orderId: String? = null,
    val outTradeNo: String? = null,
    val reconcileType: String? = null
)
