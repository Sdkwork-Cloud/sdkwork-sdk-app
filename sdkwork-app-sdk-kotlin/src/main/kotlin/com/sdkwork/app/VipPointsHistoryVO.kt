package com.sdkwork.app

data class VipPointsHistoryVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val changeType: String? = null,
    val changeAmount: Int? = null,
    val beforeBalance: Int? = null,
    val afterBalance: Int? = null,
    val sourceType: String? = null,
    val remark: String? = null
)
