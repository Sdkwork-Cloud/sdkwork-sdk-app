package com.sdkwork.app

data class ChatMessageSendForm(
    val sessionId: Int? = null,
    val content: String? = null,
    val type: String? = null,
    val format: String? = null,
    val quoteMessageId: Int? = null,
    val needThinking: Boolean? = null,
    val streaming: Boolean? = null,
    val modelId: String? = null,
    val systemPrompt: String? = null,
    val temperature: Double? = null,
    val maxTokens: Int? = null,
    val topP: Double? = null
)
