package com.sdkwork.app

data class CategoryUpdateForm(
    val name: String? = null,
    val icon: String? = null,
    val description: String? = null,
    val sort: Int? = null,
    val status: Int? = null
)
