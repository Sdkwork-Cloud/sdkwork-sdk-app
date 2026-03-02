package com.sdkwork.app

data class LotteryActivityVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val title: String? = null,
    val coverImage: String? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val freeDrawCount: Int? = null,
    val pointsCost: Int? = null,
    val prizePreview: List<PrizePreview>? = null,
    val canDraw: Boolean? = null
)
