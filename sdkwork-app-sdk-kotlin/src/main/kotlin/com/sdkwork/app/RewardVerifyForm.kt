package com.sdkwork.app

data class RewardVerifyForm(
    val advertId: String? = null,
    val rewardId: String? = null,
    val verificationToken: String? = null,
    val deviceId: String? = null,
    val ipAddress: String? = null
)
