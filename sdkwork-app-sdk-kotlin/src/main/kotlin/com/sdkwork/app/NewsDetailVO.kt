package com.sdkwork.app

data class NewsDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val newsId: String? = null,
    val title: String? = null,
    val summary: String? = null,
    val url: String? = null,
    val source: String? = null,
    val categoryId: Int? = null,
    val tags: TagsContent? = null,
    val publishTime: String? = null
)
