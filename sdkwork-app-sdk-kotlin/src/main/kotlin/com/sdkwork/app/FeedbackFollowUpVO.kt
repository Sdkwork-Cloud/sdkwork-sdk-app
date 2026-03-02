package com.sdkwork.app

data class FeedbackFollowUpVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val feedbackId: String? = null,
    val content: String? = null,
    val attachmentUrl: String? = null,
    val followUpTime: String? = null,
    val follower: String? = null
)
