package com.sdkwork.app

data class ReportDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val type: String? = null,
    val targetId: String? = null,
    val content: String? = null,
    val attachmentUrl: String? = null,
    val screenshotUrl: String? = null,
    val status: String? = null,
    val submitTime: String? = null,
    val processTime: String? = null,
    val processResult: String? = null
)
