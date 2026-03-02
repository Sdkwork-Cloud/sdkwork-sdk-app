package com.sdkwork.app

data class VoiceSpeakerQueryForm(
    val page: Int? = null,
    val size: Int? = null,
    val keyword: String? = null,
    val gender: String? = null,
    val ageType: String? = null,
    val type: String? = null,
    val channel: String? = null,
    val status: String? = null
)
