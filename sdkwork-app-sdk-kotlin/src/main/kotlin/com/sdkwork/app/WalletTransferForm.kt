package com.sdkwork.app

data class WalletTransferForm(
    val accountType: String? = null,
    val toUserId: String? = null,
    val amount: Double? = null,
    val points: Int? = null,
    val requestNo: String? = null,
    val remarks: String? = null
)
