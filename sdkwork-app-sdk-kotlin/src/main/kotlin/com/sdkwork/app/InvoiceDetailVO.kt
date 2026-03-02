package com.sdkwork.app

data class InvoiceDetailVO(
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
    val amountExcludingTax: Double? = null,
    val taxAmount: Double? = null,
    val totalAmount: Double? = null,
    val taxRate: Double? = null,
    val currency: String? = null,
    val bankName: String? = null,
    val bankAccount: String? = null,
    val registerAddress: String? = null,
    val registerPhone: String? = null,
    val electronicUrl: String? = null,
    val invoiceTime: String? = null,
    val items: List<InvoiceItemVO>? = null
)
