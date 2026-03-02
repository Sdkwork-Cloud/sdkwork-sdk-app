package com.sdkwork.app

data class TenantUpdateForm(
    val name: String? = null,
    val description: String? = null,
    val contactPerson: String? = null,
    val contactPhone: String? = null,
    val expireTime: String? = null
)
