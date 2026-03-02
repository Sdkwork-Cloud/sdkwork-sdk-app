package com.sdkwork.app

data class ChatSessionCreateForm(
    val name: String? = null,
    val description: String? = null,
    val modelId: String? = null,
    val systemPrompt: String? = null,
    val temperature: Double? = null,
    val maxTokens: Int? = null,
    val topP: Double? = null,
    val type: String? = null,
    val resourceId: String? = null
)
