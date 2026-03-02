package com.sdkwork.app

data class TaskRewardVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val rewardId: String? = null,
    val taskId: String? = null,
    val rewardType: String? = null,
    val rewardAmount: Int? = null,
    val status: String? = null,
    val message: String? = null,
    val claimedAt: String? = null
)
