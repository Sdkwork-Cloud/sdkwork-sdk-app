package com.sdkwork.app

data class PartnerVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val partnerId: String? = null,
    val name: String? = null,
    val level: String? = null,
    val status: String? = null,
    val promotionCode: String? = null,
    val contactName: String? = null,
    val contactPhone: String? = null,
    val totalCommission: Double? = null,
    val withdrawableCommission: Double? = null
)
