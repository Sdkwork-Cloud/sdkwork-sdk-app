package com.sdkwork.app

data class AccountRiskCheckForm(
    val userId: String? = null,
    val deviceId: String? = null,
    val ipAddress: String? = null,
    val scene: String? = null,
    val location: String? = null
)
