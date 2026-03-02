package com.sdkwork.app

data class AudioTranscriptionForm(
    val audioUrl: String? = null,
    val model: String? = null,
    val language: String? = null,
    val format: String? = null
)
