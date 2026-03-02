package com.sdkwork.app

data class InvoiceStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalInvoices: Int? = null,
    val pendingInvoices: Int? = null,
    val completedInvoices: Int? = null,
    val totalAmount: Double? = null
)
