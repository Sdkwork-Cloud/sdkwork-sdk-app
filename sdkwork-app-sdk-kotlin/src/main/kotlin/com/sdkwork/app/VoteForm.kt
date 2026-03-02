package com.sdkwork.app

data class VoteForm(
    val contentType: String? = null,
    val contentId: Int? = null,
    val rating: String? = null,
    val source: String? = null,
    val deviceInfo: String? = null
)
