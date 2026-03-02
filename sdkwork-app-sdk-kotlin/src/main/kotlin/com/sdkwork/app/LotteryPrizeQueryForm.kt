package com.sdkwork.app

data class LotteryPrizeQueryForm(
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val claimStatus: String? = null,
    val size: Int? = null,
    val page: Int? = null
)
