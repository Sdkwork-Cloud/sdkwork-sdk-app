package com.sdkwork.app

data class SystemStatusVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val status: String? = null,
    val message: String? = null,
    val timestamp: String? = null,
    val version: String? = null,
    val services: ServiceStatus? = null
)
