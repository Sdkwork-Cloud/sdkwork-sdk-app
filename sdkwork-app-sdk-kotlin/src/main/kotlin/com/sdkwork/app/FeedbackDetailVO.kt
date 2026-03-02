package com.sdkwork.app

data class FeedbackDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val type: String? = null,
    val content: String? = null,
    val contact: String? = null,
    val attachmentUrl: String? = null,
    val screenshotUrl: String? = null,
    val status: String? = null,
    val submitTime: String? = null,
    val processTime: String? = null,
    val followUps: List<FeedbackFollowUpVO>? = null
)
