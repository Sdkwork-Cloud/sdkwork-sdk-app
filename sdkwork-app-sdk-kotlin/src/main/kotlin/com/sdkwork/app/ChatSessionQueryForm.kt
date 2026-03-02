package com.sdkwork.app

data class ChatSessionQueryForm(
    val sessionId: Int? = null,
    val name: String? = null,
    val type: String? = null,
    val page: Int? = null,
    val size: Int? = null,
    val sortBy: String? = null,
    val sortDirection: String? = null,
    val includeMessageCount: Boolean? = null
)
