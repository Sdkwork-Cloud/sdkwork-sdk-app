package com.sdkwork.app

data class OAuthLoginForm(
    val provider: String? = null,
    val code: String? = null,
    val state: String? = null,
    val deviceId: String? = null,
    val deviceType: String? = null
)
