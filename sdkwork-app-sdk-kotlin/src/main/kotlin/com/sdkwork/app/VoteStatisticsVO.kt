package com.sdkwork.app

data class VoteStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalVotes: Int? = null,
    val likes: Int? = null,
    val dislikes: Int? = null,
    val neutrals: Int? = null,
    val likeRatio: String? = null
)
