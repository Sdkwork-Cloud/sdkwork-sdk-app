package com.sdkwork.app

data class SensitiveWordsForm(
    val text: String? = null,
    val wordListType: String? = null,
    val mode: String? = null,
    val replacement: String? = null,
    val categories: List<String>? = null
)
