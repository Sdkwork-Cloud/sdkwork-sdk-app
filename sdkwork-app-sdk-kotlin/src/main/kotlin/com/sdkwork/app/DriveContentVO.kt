package com.sdkwork.app

data class DriveContentVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val fileId: String? = null,
    val fileUuid: String? = null,
    val fileVersion: String? = null,
    val contentId: String? = null,
    val encoding: String? = null,
    val prompt: String? = null,
    val thinkingContent: String? = null,
    val text: String? = null,
    val contents: Map<String, String>? = null
)
