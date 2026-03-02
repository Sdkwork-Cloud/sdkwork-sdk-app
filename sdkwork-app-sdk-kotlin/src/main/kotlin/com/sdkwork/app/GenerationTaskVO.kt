package com.sdkwork.app

data class GenerationTaskVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val taskId: Int? = null,
    val requestId: String? = null,
    val type: String? = null,
    val model: String? = null,
    val channel: String? = null,
    val status: String? = null,
    val progress: Int? = null,
    val inputParams: GenerationInput? = null,
    val outputResult: GenerationOutput? = null,
    val cost: Double? = null,
    val errorCode: String? = null,
    val errorMessage: String? = null,
    val retryCount: Int? = null,
    val maxRetry: Int? = null,
    val startedAt: String? = null,
    val completedAt: String? = null,
    val conversationId: Int? = null,
    val messageId: Int? = null,
    val parentId: Int? = null,
    val batchId: String? = null,
    val bizScene: String? = null,
    val bizId: Int? = null,
    val done: Boolean? = null
)
