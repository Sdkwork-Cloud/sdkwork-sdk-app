package com.sdkwork.app

data class AppConfigVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val version: String? = null,
    val buildNumber: String? = null,
    val apiVersion: String? = null,
    val serverTime: Int? = null,
    val features: Map<String, Boolean>? = null,
    val systemConfig: Map<String, Any>? = null,
    val maintenanceMode: Boolean? = null,
    val maintenanceMessage: String? = null
)
