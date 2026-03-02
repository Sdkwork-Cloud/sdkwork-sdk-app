package com.sdkwork.app

data class CategoryItem(
    val id: String? = null,
    val name: String? = null,
    val description: String? = null,
    val parentId: String? = null,
    val subcategories: List<CategoryItem>? = null,
    val tags: List<String>? = null
)
