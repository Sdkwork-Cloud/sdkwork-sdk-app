package com.sdkwork.app

data class VerifyCodeSendForm(
    val target: String? = null,
    val type: String? = null,
    val verifyType: String? = null,
    val deviceId: String? = null
)
