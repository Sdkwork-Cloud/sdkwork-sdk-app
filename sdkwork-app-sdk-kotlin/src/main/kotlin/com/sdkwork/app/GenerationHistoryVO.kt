package com.sdkwork.app

data class GenerationHistoryVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val type: String? = null,
    val taskId: String? = null,
    val title: String? = null,
    val description: String? = null,
    val status: String? = null,
    val duration: Int? = null,
    val resultUrl: String? = null,
    val resultPreview: String? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val modelName: String? = null,
    val tokenUsage: Int? = null
)
