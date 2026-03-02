package com.sdkwork.app

data class ConversationQueryForm(
    val page: Int? = null,
    val size: Int? = null,
    val conversationType: String? = null,
    val showUnread: Boolean? = null,
    val keyword: String? = null
)
