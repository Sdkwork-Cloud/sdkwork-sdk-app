package com.sdkwork.app

data class TenantDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val name: String? = null,
    val code: String? = null,
    val type: String? = null,
    val bizType: String? = null,
    val bizId: Int? = null,
    val status: String? = null,
    val description: String? = null,
    val adminUserId: Int? = null,
    val installAppList: InstallAppList? = null,
    val metadata: TenantMetadata? = null,
    val contactPerson: String? = null,
    val contactPhone: String? = null,
    val tokenExpirationMs: Int? = null,
    val refreshTokenExpirationMs: Int? = null,
    val expireTime: String? = null
)
