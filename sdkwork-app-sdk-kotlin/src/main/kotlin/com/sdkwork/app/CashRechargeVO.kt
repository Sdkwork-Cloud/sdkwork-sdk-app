package com.sdkwork.app

data class CashRechargeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val transactionId: String? = null,
    val accountId: String? = null,
    val amount: Double? = null,
    val balanceAfter: Double? = null,
    val status: String? = null,
    val paymentMethod: String? = null,
    val payUrl: String? = null
)
