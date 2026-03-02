package com.sdkwork.app

data class AccountDeleteForm(
    val password: String? = null,
    val reason: String? = null,
    val confirm: Boolean? = null,
    val timestamp: Int? = null
)
