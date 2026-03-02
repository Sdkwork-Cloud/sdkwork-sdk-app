package com.sdkwork.app

data class CashTransferForm(
    val toUserId: String? = null,
    val amount: Double? = null,
    val remarks: String? = null,
    val payPassword: String? = null
)
