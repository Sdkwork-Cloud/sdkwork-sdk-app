package com.sdkwork.app

data class PartnerDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val partnerId: String? = null,
    val name: String? = null,
    val level: String? = null,
    val status: String? = null,
    val promotionCode: String? = null,
    val contactName: String? = null,
    val contactPhone: String? = null,
    val contactEmail: String? = null,
    val companyAddress: String? = null,
    val businessLicense: String? = null,
    val settlementAccount: String? = null,
    val commissionRate: Double? = null,
    val totalCommission: Double? = null,
    val withdrawableCommission: Double? = null,
    val withdrawnCommission: Double? = null,
    val parentId: Int? = null,
    val cooperationStartTime: String? = null,
    val cooperationEndTime: String? = null,
    val remark: String? = null
)
