package com.sdkwork.app

data class PasswordChangeForm(
    val oldPassword: String? = null,
    val newPassword: String? = null,
    val confirmPassword: String? = null,
    val verifyCode: String? = null
)
