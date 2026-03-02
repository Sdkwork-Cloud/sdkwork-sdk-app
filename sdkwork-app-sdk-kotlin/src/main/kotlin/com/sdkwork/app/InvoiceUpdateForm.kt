package com.sdkwork.app

data class InvoiceUpdateForm(
    val title: String? = null,
    val taxNo: String? = null,
    val bankName: String? = null,
    val bankAccount: String? = null,
    val registerAddress: String? = null,
    val registerPhone: String? = null
)
