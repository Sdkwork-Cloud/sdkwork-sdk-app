package com.sdkwork.app

data class AccountRiskVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userId: String? = null,
    val deviceId: String? = null,
    val riskLevel: String? = null,
    val riskScore: Int? = null,
    val risks: List<RiskItem>? = null,
    val suggestion: String? = null,
    val needVerification: Boolean? = null
)
