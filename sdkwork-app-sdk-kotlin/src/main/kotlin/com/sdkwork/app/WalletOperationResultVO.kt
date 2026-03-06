package com.sdkwork.app

data class WalletOperationResultVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val requestNo: String? = null,
    val transactionId: String? = null,
    val operationType: String? = null,
    val accountType: String? = null,
    val status: String? = null,
    val statusName: String? = null,
    val fromAccountId: String? = null,
    val toAccountId: String? = null,
    val amount: Double? = null,
    val points: Int? = null,
    val tokens: Int? = null,
    val fromBalanceAfter: Double? = null,
    val toBalanceAfter: Double? = null,
    val fromPointsAfter: Int? = null,
    val toPointsAfter: Int? = null,
    val tokenAfter: Int? = null,
    val frozenBalance: Double? = null,
    val channel: String? = null,
    val resultDesc: String? = null,
    val processedAt: String? = null
)
