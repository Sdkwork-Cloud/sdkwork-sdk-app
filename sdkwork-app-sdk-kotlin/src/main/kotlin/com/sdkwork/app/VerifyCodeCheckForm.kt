package com.sdkwork.app

data class VerifyCodeCheckForm(
    val target: String? = null,
    val type: String? = null,
    val verifyType: String? = null,
    val code: String? = null
)
