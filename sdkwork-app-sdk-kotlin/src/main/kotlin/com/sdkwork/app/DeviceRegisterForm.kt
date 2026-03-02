package com.sdkwork.app

data class DeviceRegisterForm(
    val deviceType: String? = null,
    val deviceId: String? = null,
    val pushToken: String? = null,
    val osVersion: String? = null,
    val appVersion: String? = null
)
