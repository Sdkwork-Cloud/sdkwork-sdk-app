package com.sdkwork.app

data class ChatSessionUpdateForm(
    val sessionId: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val modelId: String? = null,
    val systemPrompt: String? = null,
    val temperature: Double? = null,
    val maxTokens: Int? = null,
    val topP: Double? = null,
    val status: String? = null
)
