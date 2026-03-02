package com.sdkwork.app

data class TagCreateForm(
    val name: String? = null,
    val code: String? = null,
    val color: String? = null,
    val description: String? = null,
    val status: Int? = null
)
