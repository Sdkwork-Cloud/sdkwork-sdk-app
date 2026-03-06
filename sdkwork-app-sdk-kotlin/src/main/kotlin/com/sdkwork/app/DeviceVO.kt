package com.sdkwork.app

data class DeviceVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val deviceId: String? = null,
    val type: String? = null,
    val deviceType: String? = null,
    val name: String? = null,
    val deviceName: String? = null,
    val pushToken: String? = null,
    val description: String? = null,
    val status: String? = null,
    val ipAddress: String? = null,
    val macAddress: String? = null,
    val metadata: Map<String, Any>? = null,
    val userId: String? = null,
    val osVersion: String? = null,
    val appVersion: String? = null,
    val isActive: Boolean? = null,
    val registerTime: String? = null,
    val lastActiveAt: String? = null
)
