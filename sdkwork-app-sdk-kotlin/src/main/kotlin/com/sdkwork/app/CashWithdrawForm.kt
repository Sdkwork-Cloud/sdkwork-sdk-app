package com.sdkwork.app

data class CashWithdrawForm(
    val amount: Double? = null,
    val withdrawMethod: String? = null,
    val accountNo: String? = null,
    val accountName: String? = null,
    val bankName: String? = null,
    val remarks: String? = null
)
