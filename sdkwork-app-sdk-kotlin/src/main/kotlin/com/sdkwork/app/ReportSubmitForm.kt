package com.sdkwork.app

data class ReportSubmitForm(
    val type: String? = null,
    val targetId: String? = null,
    val content: String? = null,
    val attachmentUrl: String? = null,
    val screenshotUrl: String? = null
)
