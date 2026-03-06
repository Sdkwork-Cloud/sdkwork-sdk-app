package com.sdkwork.app

data class ProductCategoryUpdateRequest(
    val name: String? = null,
    val parentId: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val sort: Int? = null,
    val enabled: Boolean? = null
)
