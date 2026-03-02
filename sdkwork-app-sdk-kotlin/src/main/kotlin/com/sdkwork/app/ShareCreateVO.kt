package com.sdkwork.app

data class ShareCreateVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val shareId: String? = null,
    val shareUrl: String? = null,
    val qrCode: String? = null,
    val expireTime: String? = null,
    val password: String? = null
)
