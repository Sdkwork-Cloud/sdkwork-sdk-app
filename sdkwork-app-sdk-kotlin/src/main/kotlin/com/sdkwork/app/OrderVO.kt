package com.sdkwork.app

data class OrderVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val orderId: String? = null,
    val orderSn: String? = null,
    val orderType: String? = null,
    val subject: String? = null,
    val productImage: String? = null,
    val quantity: Int? = null,
    val totalAmount: String? = null,
    val paidAmount: String? = null,
    val paidPointsAmount: String? = null,
    val discountAmount: String? = null,
    val shippingAmount: String? = null,
    val status: String? = null,
    val statusName: String? = null,
    val refundStatus: String? = null,
    val paymentMethod: String? = null,
    val paymentProvider: String? = null,
    val payTime: String? = null,
    val expireTime: String? = null,
    val remark: String? = null
)
