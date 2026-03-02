package com.sdkwork.app

data class PasswordResetForm(
    val account: String? = null,
    val code: String? = null,
    val newPassword: String? = null,
    val confirmPassword: String? = null
)
