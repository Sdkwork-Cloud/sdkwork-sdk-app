package com.sdkwork.app

data class PrizeClaimVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val success: Boolean? = null,
    val prizeName: String? = null,
    val prizeType: String? = null,
    val claimTime: String? = null,
    val rewardDetails: Map<String, Any>? = null,
    val message: String? = null
)
