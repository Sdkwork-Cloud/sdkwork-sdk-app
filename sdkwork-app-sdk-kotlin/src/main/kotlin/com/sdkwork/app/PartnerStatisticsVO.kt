package com.sdkwork.app

data class PartnerStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalPartners: Int? = null,
    val activePartners: Int? = null,
    val pendingPartners: Int? = null,
    val totalCommission: Double? = null,
    val withdrawableCommission: Double? = null
)
