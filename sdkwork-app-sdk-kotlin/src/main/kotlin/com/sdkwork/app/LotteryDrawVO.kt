package com.sdkwork.app

data class LotteryDrawVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val isWin: Boolean? = null,
    val prizeId: String? = null,
    val prizeName: String? = null,
    val prizeImage: String? = null,
    val prizeType: String? = null,
    val isGrandPrize: Boolean? = null,
    val winTime: String? = null,
    val recordId: String? = null,
    val remainingFreeCount: Int? = null,
    val pointsCost: Int? = null,
    val message: String? = null
)
