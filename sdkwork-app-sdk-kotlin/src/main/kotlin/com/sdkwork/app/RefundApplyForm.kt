package com.sdkwork.app

data class RefundApplyForm(
    val orderId: String? = null,
    val refundAmount: String? = null,
    val refundReason: String? = null,
    val reason: String? = null,
    val refundType: String? = null,
    val proofImage: String? = null
)
