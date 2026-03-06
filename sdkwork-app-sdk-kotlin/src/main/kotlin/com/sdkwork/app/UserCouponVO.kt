package com.sdkwork.app

data class UserCouponVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userCouponId: String? = null,
    val couponId: String? = null,
    val couponName: String? = null,
    val couponCode: String? = null,
    val type: String? = null,
    val typeName: String? = null,
    val amount: Int? = null,
    val discount: Double? = null,
    val minConsume: Int? = null,
    val acquireAt: String? = null,
    val acquireRequestNo: String? = null,
    val acquireType: String? = null,
    val pointCost: Int? = null,
    val pointsRefunded: Boolean? = null,
    val pointsRefundAt: String? = null,
    val useAt: String? = null,
    val expireAt: String? = null,
    val status: String? = null,
    val statusName: String? = null,
    val orderId: String? = null,
    val canShared: Boolean? = null,
    val available: Boolean? = null,
    val remainingDays: Int? = null
)
