package com.sdkwork.app

data class CollectionItemAddForm(
    val contentType: String? = null,
    val contentId: Int? = null,
    val title: String? = null,
    val description: String? = null,
    val position: Int? = null
)
