package com.sdkwork.app

data class VipBenefitVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val benefitKey: String? = null,
    val type: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val claimed: Boolean? = null,
    val usageLimit: Int? = null,
    val usedCount: Int? = null
)
