package com.sdkwork.app

data class DeviceDistributionVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val deviceType: String? = null,
    val deviceModel: String? = null,
    val osType: String? = null,
    val osVersion: String? = null,
    val userCount: Int? = null,
    val percentage: Double? = null,
    val activeCount: Int? = null
)
