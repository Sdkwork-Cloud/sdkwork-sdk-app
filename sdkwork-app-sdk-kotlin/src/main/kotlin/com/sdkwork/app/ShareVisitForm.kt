package com.sdkwork.app

data class ShareVisitForm(
    val shareId: String? = null,
    val visitType: String? = null,
    val userAgent: String? = null,
    val ipAddress: String? = null,
    val deviceInfo: String? = null
)
