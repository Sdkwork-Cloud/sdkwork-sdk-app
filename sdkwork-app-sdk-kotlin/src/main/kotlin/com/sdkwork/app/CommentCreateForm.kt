package com.sdkwork.app

data class CommentCreateForm(
    val contentType: String? = null,
    val contentId: Int? = null,
    val content: String? = null,
    val deviceInfo: String? = null
)
