package com.sdkwork.app

data class TenantStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalTenants: Int? = null,
    val activeTenants: Int? = null,
    val frozenTenants: Int? = null,
    val closedTenants: Int? = null
)
