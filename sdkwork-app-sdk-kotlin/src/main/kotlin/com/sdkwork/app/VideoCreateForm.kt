package com.sdkwork.app

data class VideoCreateForm(
    val title: String? = null,
    val description: String? = null,
    val contentUrl: String? = null,
    val format: String? = null,
    val duration: Int? = null,
    val width: Int? = null,
    val height: Int? = null,
    val categoryId: Int? = null
)
