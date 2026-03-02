package com.sdkwork.app

data class AdvancedSearchRequest(
    val keyword: String? = null,
    val type: String? = null,
    val filters: Map<String, Any>? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
