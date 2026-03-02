package com.sdkwork.app

data class SupportMessageVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val sessionId: String? = null,
    val content: String? = null,
    val attachmentUrl: String? = null,
    val senderType: String? = null,
    val sendTime: String? = null,
    val read: Boolean? = null
)
