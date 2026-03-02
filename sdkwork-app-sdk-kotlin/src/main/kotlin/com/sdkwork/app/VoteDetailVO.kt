package com.sdkwork.app

data class VoteDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val voteId: String? = null,
    val userId: Int? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val rating: String? = null,
    val source: String? = null,
    val clientIp: String? = null,
    val deviceInfo: String? = null
)
