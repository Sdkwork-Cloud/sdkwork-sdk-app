package com.sdkwork.app

data class SupportMessageQueryForm(
    val sessionId: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
