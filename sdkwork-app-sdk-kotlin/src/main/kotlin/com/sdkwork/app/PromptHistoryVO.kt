package com.sdkwork.app

data class PromptHistoryVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val promptId: Int? = null,
    val promptTitle: String? = null,
    val promptContent: String? = null,
    val usedContent: String? = null,
    val responseContent: String? = null,
    val model: String? = null,
    val duration: Int? = null,
    val inputTokens: Int? = null,
    val outputTokens: Int? = null,
    val success: Boolean? = null,
    val errorMessage: String? = null
)
