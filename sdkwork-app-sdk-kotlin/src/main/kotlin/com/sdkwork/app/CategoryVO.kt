package com.sdkwork.app

data class CategoryVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val code: String? = null,
    val icon: String? = null,
    val description: String? = null,
    val parentId: Int? = null,
    val sort: Int? = null,
    val status: Int? = null
)
