package com.sdkwork.app

data class WalletWithdrawalForm(
    val amount: Double? = null,
    val withdrawMethod: String? = null,
    val accountNo: String? = null,
    val accountName: String? = null,
    val bankName: String? = null,
    val requestNo: String? = null,
    val remarks: String? = null
)
