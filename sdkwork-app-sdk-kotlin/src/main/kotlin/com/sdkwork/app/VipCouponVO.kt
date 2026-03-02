package com.sdkwork.app

data class VipCouponVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val name: String? = null,
    val discount: Double? = null,
    val minAmount: Double? = null,
    val reduceAmount: Double? = null,
    val validFrom: String? = null,
    val validTo: String? = null,
    val status: String? = null,
    val used: Boolean? = null
)
