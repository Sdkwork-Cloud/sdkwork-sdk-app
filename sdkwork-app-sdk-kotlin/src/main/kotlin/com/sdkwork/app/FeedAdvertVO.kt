package com.sdkwork.app

data class FeedAdvertVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val advertId: String? = null,
    val advertName: String? = null,
    val advertType: String? = null,
    val positionId: String? = null,
    val creativeUrl: String? = null,
    val landingUrl: String? = null,
    val priority: Int? = null,
    val enabled: Boolean? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val clickCount: Int? = null,
    val impressionCount: Int? = null,
    val title: String? = null,
    val description: String? = null,
    val imageUrl: String? = null,
    val likes: Int? = null,
    val comments: Int? = null
)
