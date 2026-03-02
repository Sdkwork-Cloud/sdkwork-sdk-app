package com.sdkwork.app

data class VipInfoVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val vipLevel: Int? = null,
    val vipLevelName: String? = null,
    val vipStatus: String? = null,
    val effectiveTime: String? = null,
    val expireTime: String? = null,
    val remainingDays: Int? = null,
    val totalDays: Int? = null,
    val totalSpent: Int? = null,
    val vipPoints: Int? = null,
    val growthValue: Int? = null,
    val upgradeGrowthValue: Int? = null,
    val customerService: CustomerServiceInfo? = null,
    val benefits: List<VipBenefitVO>? = null,
    val coupons: List<VipCouponVO>? = null
)
