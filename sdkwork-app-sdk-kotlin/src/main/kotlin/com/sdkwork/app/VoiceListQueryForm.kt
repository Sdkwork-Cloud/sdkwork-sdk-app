package com.sdkwork.app

data class VoiceListQueryForm(
    val language: String? = null,
    val gender: String? = null,
    val style: String? = null,
    val ageRange: String? = null
)
