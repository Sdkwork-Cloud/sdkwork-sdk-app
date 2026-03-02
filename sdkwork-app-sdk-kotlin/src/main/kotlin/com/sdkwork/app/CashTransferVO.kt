package com.sdkwork.app

data class CashTransferVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val transactionId: String? = null,
    val fromAccountId: String? = null,
    val toAccountId: String? = null,
    val amount: Double? = null,
    val status: String? = null,
    val fromBalanceAfter: Double? = null,
    val toBalanceAfter: Double? = null
)
