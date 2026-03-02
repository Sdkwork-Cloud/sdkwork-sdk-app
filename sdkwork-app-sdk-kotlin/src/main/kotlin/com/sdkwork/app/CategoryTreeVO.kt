package com.sdkwork.app

data class CategoryTreeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val code: String? = null,
    val icon: String? = null,
    val parentId: Int? = null,
    val sort: Int? = null,
    val status: Int? = null,
    val children: List<CategoryTreeVO>? = null
)
