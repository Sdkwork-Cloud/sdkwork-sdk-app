package com.sdkwork.app

data class PasswordResetRequestForm(
    val account: String? = null,
    val channel: String? = null,
    val deviceId: String? = null,
    val locale: String? = null,
    val redirectUri: String? = null
)
