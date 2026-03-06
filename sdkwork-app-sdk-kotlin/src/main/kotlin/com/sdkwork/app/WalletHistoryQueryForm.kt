package com.sdkwork.app

data class WalletHistoryQueryForm(
    val transactionType: String? = null,
    val status: String? = null,
    val startDate: String? = null,
    val endDate: String? = null,
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val accountType: String? = null
)
