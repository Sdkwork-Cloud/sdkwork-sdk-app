package com.sdkwork.app

data class PointsExchangeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val recordId: String? = null,
    val success: Boolean? = null,
    val goodsName: String? = null,
    val pointsCost: Int? = null,
    val remainingPoints: Int? = null,
    val quantity: Int? = null,
    val exchangeTime: String? = null,
    val status: String? = null,
    val rewardContent: String? = null,
    val message: String? = null
)
