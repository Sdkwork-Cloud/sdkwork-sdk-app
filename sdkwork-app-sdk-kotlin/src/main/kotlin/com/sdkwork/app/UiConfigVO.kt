package com.sdkwork.app

data class UiConfigVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val configKey: String? = null,
    val configName: String? = null,
    val uiConfig: Map<String, Any>? = null,
    val version: String? = null
)
