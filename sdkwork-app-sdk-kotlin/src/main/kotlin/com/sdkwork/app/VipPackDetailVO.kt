package com.sdkwork.app

data class VipPackDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val price: Double? = null,
    val originalPrice: Double? = null,
    val pointAmount: Int? = null,
    val vipDurationDays: Int? = null,
    val levelId: Int? = null,
    val levelName: String? = null,
    val groupId: Int? = null,
    val groupName: String? = null,
    val validFrom: String? = null,
    val validTo: String? = null,
    val sortWeight: Int? = null,
    val benefits: List<VipBenefitVO>? = null
)
