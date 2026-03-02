package com.sdkwork.app

data class InvoiceCreateForm(
    val title: String? = null,
    val titleType: String? = null,
    val taxNo: String? = null,
    val type: String? = null,
    val totalAmount: Double? = null
)
