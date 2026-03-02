package com.sdkwork.app

data class UserProfileUpdateForm(
    val nickname: String? = null,
    val avatar: String? = null,
    val gender: String? = null,
    val birthday: String? = null,
    val region: String? = null,
    val bio: String? = null,
    val occupation: String? = null,
    val interests: String? = null,
    val phone: String? = null,
    val email: String? = null,
    val verifyCode: String? = null
)
