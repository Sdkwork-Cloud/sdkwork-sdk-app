package com.sdkwork.app

data class FeedCreateForm(
    val content: String? = null,
    val title: String? = null,
    val categoryId: Int? = null,
    val images: List<String>? = null,
    val source: String? = null,
    val sourceUrl: String? = null
)
