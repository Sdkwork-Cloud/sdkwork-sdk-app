package com.sdkwork.app

data class AccountDeactivateForm(
    val reason: String? = null,
    val verifyCode: String? = null,
    val password: String? = null,
    val confirm: Boolean? = null,
    val remark: String? = null
)
