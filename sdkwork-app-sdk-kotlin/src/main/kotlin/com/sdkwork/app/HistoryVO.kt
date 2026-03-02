package com.sdkwork.app

data class HistoryVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val historyId: String? = null,
    val accountId: String? = null,
    val transactionType: String? = null,
    val transactionTypeName: String? = null,
    val amount: Double? = null,
    val points: Int? = null,
    val tokens: Int? = null,
    val balanceBefore: Double? = null,
    val balanceAfter: Double? = null,
    val pointsBefore: Int? = null,
    val pointsAfter: Int? = null,
    val transactionId: String? = null,
    val relatedId: String? = null,
    val relatedType: String? = null,
    val remarks: String? = null,
    val status: String? = null,
    val statusName: String? = null,
    val counterpartyAccountId: String? = null,
    val counterpartyUserId: String? = null,
    val counterpartyUserName: String? = null
)
