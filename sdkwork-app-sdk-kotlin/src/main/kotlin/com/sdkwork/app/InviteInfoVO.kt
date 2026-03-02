package com.sdkwork.app

data class InviteInfoVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val inviteCode: String? = null,
    val inviteLink: String? = null,
    val inviteCount: Int? = null,
    val rewardAmount: String? = null,
    val remainingReward: String? = null
)
