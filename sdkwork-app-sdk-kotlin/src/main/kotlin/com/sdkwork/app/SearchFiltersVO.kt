package com.sdkwork.app

data class SearchFiltersVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val typeFilters: Map<String, String>? = null,
    val dateFilters: Map<String, String>? = null,
    val otherFilters: Map<String, Any>? = null
)
