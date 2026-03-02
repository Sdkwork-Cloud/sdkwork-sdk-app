package com.sdkwork.app

data class InvoiceItemVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val itemId: String? = null,
    val productName: String? = null,
    val specification: String? = null,
    val unit: String? = null,
    val quantity: Double? = null,
    val unitPriceExcludingTax: Double? = null,
    val amountExcludingTax: Double? = null,
    val taxAmount: Double? = null,
    val totalAmount: Double? = null,
    val taxRate: Double? = null
)
