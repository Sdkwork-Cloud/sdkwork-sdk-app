package com.sdkwork.app

data class ServiceStatus(
    val api: String? = null,
    val database: String? = null,
    val cache: String? = null,
    val storage: String? = null,
    val thirdParty: String? = null
)
