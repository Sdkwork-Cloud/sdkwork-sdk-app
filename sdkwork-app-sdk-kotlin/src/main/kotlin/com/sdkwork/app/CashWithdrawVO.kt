package com.sdkwork.app

data class CashWithdrawVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val transactionId: String? = null,
    val accountId: String? = null,
    val amount: Double? = null,
    val balanceAfter: Double? = null,
    val frozenBalance: Double? = null,
    val status: String? = null,
    val estimatedArrivalTime: String? = null,
    val withdrawMethod: String? = null
)
