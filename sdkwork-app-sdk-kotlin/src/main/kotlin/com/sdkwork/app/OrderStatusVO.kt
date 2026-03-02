package com.sdkwork.app

data class OrderStatusVO(
    val orderId: String? = null,
    val status: String? = null,
    val statusName: String? = null,
    val expireTime: Int? = null
)
