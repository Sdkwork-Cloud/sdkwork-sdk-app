package com.sdkwork.app

data class CouponStatisticsVO(
    val totalCoupons: Int? = null,
    val unusedCount: Int? = null,
    val usedCount: Int? = null,
    val expiredCount: Int? = null
)
