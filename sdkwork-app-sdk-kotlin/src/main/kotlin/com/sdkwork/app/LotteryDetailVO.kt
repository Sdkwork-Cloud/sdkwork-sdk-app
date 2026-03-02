package com.sdkwork.app

data class LotteryDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val title: String? = null,
    val description: String? = null,
    val rules: String? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val freeDrawCount: Int? = null,
    val remainingFreeCount: Int? = null,
    val pointsCost: Int? = null,
    val myPoints: Int? = null,
    val prizes: List<LotteryPrize>? = null,
    val recentWinners: List<RecentWinner>? = null
)
