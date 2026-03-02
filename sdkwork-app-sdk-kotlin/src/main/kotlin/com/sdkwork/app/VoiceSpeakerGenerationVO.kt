package com.sdkwork.app

data class VoiceSpeakerGenerationVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val speakerId: String? = null,
    val speakerName: String? = null,
    val description: String? = null,
    val previewAudioUrl: String? = null,
    val gender: String? = null,
    val ageRange: String? = null,
    val language: String? = null,
    val style: String? = null,
    val status: String? = null,
    val favorite: Boolean? = null,
    val completedAt: String? = null
)
