package com.sdkwork.app

data class NotificationButtonVO(
    val text: String? = null,
    val type: String? = null,
    val url: String? = null,
    val action: String? = null,
    val closeOnClick: Boolean? = null
)
