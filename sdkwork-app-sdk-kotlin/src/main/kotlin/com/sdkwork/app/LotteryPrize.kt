package com.sdkwork.app

data class LotteryPrize(
    val prizeId: String? = null,
    val name: String? = null,
    val image: String? = null,
    val probability: String? = null,
    val isGrandPrize: Boolean? = null,
    val remainingCount: Int? = null
)
