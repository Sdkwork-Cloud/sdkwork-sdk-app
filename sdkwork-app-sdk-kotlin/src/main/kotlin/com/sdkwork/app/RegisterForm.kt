package com.sdkwork.app

data class RegisterForm(
    val username: String? = null,
    val password: String? = null,
    val confirmPassword: String? = null,
    val email: String? = null,
    val phone: String? = null
)
