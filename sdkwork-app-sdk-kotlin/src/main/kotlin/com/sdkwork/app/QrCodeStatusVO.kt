package com.sdkwork.app

data class QrCodeStatusVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val status: String? = null,
    val userInfo: UserInfoVO? = null,
    val token: LoginVO? = null
)
