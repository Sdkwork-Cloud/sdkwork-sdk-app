package com.sdkwork.app

data class AudioTranslationForm(
    val audioUrl: String? = null,
    val targetLanguage: String? = null,
    val model: String? = null,
    val sourceLanguage: String? = null,
    val format: String? = null
)
