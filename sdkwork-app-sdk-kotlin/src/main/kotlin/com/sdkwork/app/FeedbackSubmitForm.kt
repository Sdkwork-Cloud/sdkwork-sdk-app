package com.sdkwork.app

data class FeedbackSubmitForm(
    val type: String? = null,
    val content: String? = null,
    val contact: String? = null,
    val attachmentUrl: String? = null,
    val screenshotUrl: String? = null
)
