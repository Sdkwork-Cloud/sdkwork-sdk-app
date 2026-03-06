package com.sdkwork.app

data class WalletAssetAccountVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val accountId: String? = null,
    val accountType: String? = null,
    val accountTypeName: String? = null,
    val status: String? = null,
    val statusName: String? = null,
    val availableBalance: Double? = null,
    val frozenBalance: Double? = null,
    val availablePoints: Int? = null,
    val frozenPoints: Int? = null,
    val availableToken: Int? = null,
    val frozenToken: Int? = null
)
