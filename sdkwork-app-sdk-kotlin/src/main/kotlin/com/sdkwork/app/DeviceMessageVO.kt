package com.sdkwork.app

data class DeviceMessageVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val messageId: String? = null,
    val deviceId: String? = null,
    val type: String? = null,
    val direction: String? = null,
    val payload: Map<String, Any>? = null,
    val topic: String? = null,
    val processed: Boolean? = null,
    val error: String? = null
)
