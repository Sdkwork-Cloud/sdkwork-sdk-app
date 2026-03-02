package com.sdkwork.app

data class OrderItemVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val orderId: String? = null,
    val categoryId: String? = null,
    val productType: String? = null,
    val productId: String? = null,
    val skuId: String? = null,
    val productName: String? = null,
    val productImage: String? = null,
    val quantity: Int? = null,
    val unitPrice: String? = null,
    val totalAmount: String? = null,
    val discountAmount: String? = null,
    val paidAmount: String? = null,
    val refundedAmount: String? = null,
    val skuSpec: String? = null,
    val currency: String? = null,
    val refundStatus: String? = null,
    val reviewStatus: String? = null,
    val paymentProvider: String? = null,
    val paymentProductType: String? = null,
    val expireTime: String? = null
)
