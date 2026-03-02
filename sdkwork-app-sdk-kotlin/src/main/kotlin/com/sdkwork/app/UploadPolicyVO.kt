package com.sdkwork.app

data class UploadPolicyVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val bucketName: String? = null,
    val objectKeyPrefix: String? = null,
    val expirationTime: String? = null,
    val maxFileSize: Int? = null,
    val minFileSize: Int? = null,
    val allowedContentTypes: List<String>? = null,
    val allowOverwrite: Boolean? = null,
    val callbackUrl: String? = null
)
