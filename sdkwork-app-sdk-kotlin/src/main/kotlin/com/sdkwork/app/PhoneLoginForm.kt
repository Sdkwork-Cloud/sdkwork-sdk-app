package com.sdkwork.app

data class PhoneLoginForm(
    val phone: String? = null,
    val code: String? = null,
    val deviceId: String? = null,
    val deviceType: String? = null,
    val deviceName: String? = null,
    val appVersion: String? = null
)
