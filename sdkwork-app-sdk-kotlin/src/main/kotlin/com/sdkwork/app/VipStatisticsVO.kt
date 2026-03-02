package com.sdkwork.app

data class VipStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val status: String? = null,
    val level: String? = null,
    val startedAt: String? = null,
    val expiredAt: String? = null,
    val remainingDays: Int? = null,
    val totalDays: Int? = null,
    val privileges: List<VipPrivilegeVO>? = null,
    val renewalInfo: VipRenewalVO? = null,
    val upgradeInfo: VipUpgradeVO? = null
)
