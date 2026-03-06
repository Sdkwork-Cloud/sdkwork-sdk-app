package com.sdkwork.app

data class WalletTopupForm(
    val amount: Double? = null,
    val paymentMethod: String? = null,
    val requestNo: String? = null,
    val remarks: String? = null
)
