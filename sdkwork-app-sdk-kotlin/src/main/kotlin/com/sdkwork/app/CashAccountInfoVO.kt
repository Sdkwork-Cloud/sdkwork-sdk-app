package com.sdkwork.app

data class CashAccountInfoVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val accountId: String? = null,
    val accountType: String? = null,
    val accountTypeName: String? = null,
    val ownerId: String? = null,
    val userId: String? = null,
    val availableBalance: Double? = null,
    val frozenBalance: Double? = null,
    val totalBalance: Double? = null,
    val status: String? = null,
    val statusName: String? = null,
    val pendingBalance: Double? = null,
    val totalRecharged: Double? = null,
    val totalSpent: Double? = null,
    val totalWithdrawn: Double? = null
)
