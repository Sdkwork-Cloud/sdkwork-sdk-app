package com.sdkwork.app

data class LoginVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val accessToken: String? = null,
    val refreshToken: String? = null,
    val tokenType: String? = null,
    val expiresIn: Int? = null,
    val userInfo: UserInfoVO? = null
)
