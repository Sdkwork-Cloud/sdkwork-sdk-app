package com.sdkwork.app

data class ShareVerifyForm(
    val shareId: String? = null,
    val password: String? = null,
    val verificationCode: String? = null
)
