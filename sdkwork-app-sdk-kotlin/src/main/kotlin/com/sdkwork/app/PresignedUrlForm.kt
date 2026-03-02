package com.sdkwork.app

data class PresignedUrlForm(
    val objectKey: String? = null,
    val bucket: String? = null,
    val method: String? = null,
    val expirationSeconds: Int? = null
)
