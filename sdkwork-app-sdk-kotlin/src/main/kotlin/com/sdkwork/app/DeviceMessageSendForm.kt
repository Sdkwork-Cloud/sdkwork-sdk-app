package com.sdkwork.app

data class DeviceMessageSendForm(
    val type: String? = null,
    val payload: Map<String, Any>? = null,
    val topic: String? = null
)
