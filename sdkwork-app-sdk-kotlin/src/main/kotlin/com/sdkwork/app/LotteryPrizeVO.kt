package com.sdkwork.app

data class LotteryPrizeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val recordId: String? = null,
    val lotteryId: String? = null,
    val lotteryTitle: String? = null,
    val prizeId: String? = null,
    val prizeName: String? = null,
    val prizeImage: String? = null,
    val prizeType: String? = null,
    val isGrandPrize: Boolean? = null,
    val winTime: String? = null,
    val claimStatus: String? = null,
    val claimTime: String? = null,
    val expireTime: String? = null,
    val canClaim: Boolean? = null
)
