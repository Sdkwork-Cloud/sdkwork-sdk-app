package com.sdkwork.app

data class OrderCancelForm(
    val orderId: String? = null,
    val cancelReason: String? = null,
    val reason: String? = null,
    val cancelType: String? = null
)
