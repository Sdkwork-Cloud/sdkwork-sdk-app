package com.sdkwork.app

data class UserProfileVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val nickname: String? = null,
    val avatar: String? = null,
    val gender: String? = null,
    val birthday: Int? = null,
    val region: String? = null,
    val bio: String? = null,
    val occupation: String? = null,
    val interests: String? = null,
    val phone: String? = null,
    val email: String? = null
)
