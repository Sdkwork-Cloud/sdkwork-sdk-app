package com.sdkwork.app

data class PointsAccountInfoVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val accountId: String? = null,
    val accountType: String? = null,
    val accountTypeName: String? = null,
    val ownerId: String? = null,
    val userId: String? = null,
    val availablePoints: Int? = null,
    val frozenPoints: Int? = null,
    val totalPoints: Int? = null,
    val tokenBalance: Int? = null,
    val status: String? = null,
    val statusName: String? = null,
    val pendingPoints: Int? = null,
    val totalEarned: Int? = null,
    val totalSpent: Int? = null,
    val level: Int? = null,
    val levelName: String? = null,
    val experience: Int? = null
)
