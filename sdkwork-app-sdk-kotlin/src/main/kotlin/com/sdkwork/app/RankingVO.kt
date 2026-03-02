package com.sdkwork.app

data class RankingVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val rankingType: String? = null,
    val period: String? = null,
    val rankings: List<RankInfoVO>? = null,
    val myRank: RankInfoVO? = null,
    val totalUsers: Int? = null
)
