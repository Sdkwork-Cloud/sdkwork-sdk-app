package com.sdkwork.app

data class InvoiceVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val invoiceId: String? = null,
    val title: String? = null,
    val titleType: String? = null,
    val taxNo: String? = null,
    val type: String? = null,
    val status: String? = null,
    val invoiceCode: String? = null,
    val invoiceNo: String? = null,
    val totalAmount: Double? = null,
    val currency: String? = null
)
