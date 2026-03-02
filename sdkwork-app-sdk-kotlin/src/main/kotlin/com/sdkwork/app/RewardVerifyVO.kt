package com.sdkwork.app

data class RewardVerifyVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val verified: Boolean? = null,
    val rewardId: String? = null,
    val rewardType: String? = null,
    val rewardAmount: Int? = null,
    val message: String? = null,
    val verificationToken: String? = null
)
