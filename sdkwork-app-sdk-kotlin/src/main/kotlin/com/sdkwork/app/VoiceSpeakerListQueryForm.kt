package com.sdkwork.app

data class VoiceSpeakerListQueryForm(
    val gender: String? = null,
    val language: String? = null,
    val style: String? = null,
    val ageRange: String? = null,
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val onlyFavorite: Boolean? = null
)
