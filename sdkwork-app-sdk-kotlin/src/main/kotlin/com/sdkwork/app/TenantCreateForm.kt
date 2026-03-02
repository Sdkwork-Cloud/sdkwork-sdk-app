package com.sdkwork.app

data class TenantCreateForm(
    val name: String? = null,
    val code: String? = null,
    val type: String? = null,
    val bizType: String? = null,
    val bizId: Int? = null,
    val description: String? = null,
    val adminUserId: Int? = null,
    val contactPerson: String? = null,
    val contactPhone: String? = null,
    val expireTime: String? = null
)
