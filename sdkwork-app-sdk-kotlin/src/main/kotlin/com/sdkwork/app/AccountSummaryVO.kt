package com.sdkwork.app

data class AccountSummaryVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val cashAvailable: Double? = null,
    val cashFrozen: Double? = null,
    val pointsAvailable: Int? = null,
    val pointsFrozen: Int? = null,
    val tokenAvailable: Int? = null,
    val tokenFrozen: Int? = null,
    val hasPayPassword: Boolean? = null
)
