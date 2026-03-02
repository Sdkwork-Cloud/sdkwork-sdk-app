package com.sdkwork.app

data class TwoFactorSetupVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val enabled: Boolean? = null,
    val method: String? = null,
    val qrCodeData: String? = null,
    val secretKey: String? = null,
    val verificationCode: String? = null,
    val recoveryCodes: List<String>? = null
)
