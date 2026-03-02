package com.sdkwork.app

data class NewsCreateForm(
    val title: String? = null,
    val summary: String? = null,
    val url: String? = null,
    val source: String? = null,
    val categoryId: Int? = null
)
