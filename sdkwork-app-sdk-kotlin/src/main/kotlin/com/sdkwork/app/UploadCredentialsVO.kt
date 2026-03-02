package com.sdkwork.app

data class UploadCredentialsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val accessKeyId: String? = null,
    val secretAccessKey: String? = null,
    val sessionToken: String? = null,
    val expirationTime: String? = null,
    val bucket: String? = null,
    val region: String? = null
)
