package com.sdkwork.app

data class CommentVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val commentId: String? = null,
    val content: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val userId: Int? = null,
    val status: String? = null,
    val likes: Int? = null,
    val replyCount: Int? = null,
    val isTop: Boolean? = null,
    val parentId: Int? = null
)
