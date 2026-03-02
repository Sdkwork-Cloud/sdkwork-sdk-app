package com.sdkwork.app

data class GlobalSearchRequest(
    val keyword: String? = null,
    val type: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
