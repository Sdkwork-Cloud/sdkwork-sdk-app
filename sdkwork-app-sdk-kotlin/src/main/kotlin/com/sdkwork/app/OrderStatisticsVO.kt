package com.sdkwork.app

data class OrderStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalOrders: Int? = null,
    val pendingPayment: Int? = null,
    val pendingShipment: Int? = null,
    val pendingReceipt: Int? = null,
    val completed: Int? = null,
    val totalAmount: String? = null
)
