package com.sdkwork.app

data class FeedbackQueryForm(
    val type: String? = null,
    val status: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
