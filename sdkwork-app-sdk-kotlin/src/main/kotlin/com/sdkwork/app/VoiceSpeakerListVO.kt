package com.sdkwork.app

data class VoiceSpeakerListVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val speakers: List<VoiceSpeakerItem>? = null,
    val total: Int? = null,
    val page: Int? = null,
    val size: Int? = null
)
