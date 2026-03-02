package com.sdkwork.app

data class MusicStylesQueryForm(
    val category: String? = null,
    val genre: String? = null,
    val style: String? = null,
    val mood: String? = null,
    val instrument: String? = null
)
