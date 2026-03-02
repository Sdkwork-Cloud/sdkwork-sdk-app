package com.sdkwork.app

data class TwoFactorToggleForm(
    val enable: Boolean? = null,
    val method: String? = null,
    val verificationCode: String? = null
)
