package com.sdkwork.app

data class RolloutConfigVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val rolloutKey: String? = null,
    val rolloutName: String? = null,
    val config: Map<String, Any>? = null,
    val status: String? = null
)
