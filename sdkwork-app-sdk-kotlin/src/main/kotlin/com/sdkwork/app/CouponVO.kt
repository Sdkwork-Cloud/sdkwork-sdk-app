package com.sdkwork.app

data class CouponVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val couponId: String? = null,
    val name: String? = null,
    val type: String? = null,
    val typeName: String? = null,
    val description: String? = null,
    val amount: Int? = null,
    val pointCost: Int? = null,
    val discount: Double? = null,
    val minConsume: Int? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val total: Int? = null,
    val getLimit: Int? = null,
    val receivedCount: Int? = null,
    val usedCount: Int? = null,
    val status: String? = null,
    val statusName: String? = null,
    val stackable: Boolean? = null,
    val scopeType: String? = null,
    val scopeValue: String? = null,
    val remainingCount: Int? = null,
    val canReceive: Boolean? = null,
    val pointsExchange: Boolean? = null
)
