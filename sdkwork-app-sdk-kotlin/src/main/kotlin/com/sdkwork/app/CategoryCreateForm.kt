package com.sdkwork.app

data class CategoryCreateForm(
    val name: String? = null,
    val type: String? = null,
    val code: String? = null,
    val icon: String? = null,
    val description: String? = null,
    val parentId: Int? = null,
    val sort: Int? = null,
    val status: Int? = null
)
