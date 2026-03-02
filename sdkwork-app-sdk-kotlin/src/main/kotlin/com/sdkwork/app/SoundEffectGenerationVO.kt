package com.sdkwork.app

data class SoundEffectGenerationVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: String? = null,
    val soundEffectId: String? = null,
    val name: String? = null,
    val description: String? = null,
    val audioUrl: String? = null,
    val waveformUrl: String? = null,
    val category: String? = null,
    val duration: Int? = null,
    val status: String? = null,
    val completedAt: String? = null
)
