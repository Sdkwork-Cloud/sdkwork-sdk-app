package com.sdkwork.app

data class MusicCreateForm(
    val title: String? = null,
    val description: String? = null,
    val contentUrl: String? = null,
    val format: String? = null,
    val duration: Int? = null,
    val artist: String? = null,
    val genre: String? = null
)
