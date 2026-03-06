package com.sdkwork.app

data class ProductCategoryVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val name: String? = null,
    val parentId: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val sort: Int? = null,
    val enabled: Boolean? = null,
    val children: List<ProductCategoryVO>? = null
)
