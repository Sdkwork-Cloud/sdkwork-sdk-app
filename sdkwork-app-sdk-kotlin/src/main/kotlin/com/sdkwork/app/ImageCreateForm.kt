package com.sdkwork.app

data class ImageCreateForm(
    val title: String? = null,
    val description: String? = null,
    val url: String? = null,
    val format: String? = null,
    val width: Int? = null,
    val height: Int? = null
)
