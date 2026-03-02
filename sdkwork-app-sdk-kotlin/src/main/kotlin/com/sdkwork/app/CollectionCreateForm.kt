package com.sdkwork.app

data class CollectionCreateForm(
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val parentId: Int? = null
)
