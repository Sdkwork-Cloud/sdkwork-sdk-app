package com.sdkwork.app

data class VipInviteInfoVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val inviteCode: String? = null,
    val inviteLink: String? = null,
    val totalInvites: Int? = null,
    val successfulInvites: Int? = null,
    val rewardPoints: Int? = null,
    val rewardRule: String? = null
)
