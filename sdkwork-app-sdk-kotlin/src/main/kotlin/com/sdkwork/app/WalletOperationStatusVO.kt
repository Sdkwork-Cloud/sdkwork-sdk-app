package com.sdkwork.app

data class WalletOperationStatusVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val requestNo: String? = null,
    val found: Boolean? = null,
    val completed: Boolean? = null,
    val status: String? = null,
    val statusName: String? = null,
    val transactionId: String? = null,
    val operationType: String? = null,
    val accountType: String? = null,
    val processedAt: String? = null,
    val relatedTransactionIds: List<String>? = null,
    val details: List<HistoryVO>? = null,
    val resultDesc: String? = null
)
