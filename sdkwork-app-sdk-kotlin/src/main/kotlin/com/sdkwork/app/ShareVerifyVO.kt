package com.sdkwork.app

data class ShareVerifyVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val valid: Boolean? = null,
    val errorMessage: String? = null,
    val shareInfo: ShareInfoVO? = null
)
