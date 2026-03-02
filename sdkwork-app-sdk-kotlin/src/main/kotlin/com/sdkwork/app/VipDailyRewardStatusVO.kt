package com.sdkwork.app

data class VipDailyRewardStatusVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val canClaim: Boolean? = null,
    val claimedToday: Boolean? = null,
    val consecutiveDays: Int? = null,
    val totalDays: Int? = null
)
