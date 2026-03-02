package com.sdkwork.app

data class UpdateCheckVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val hasUpdate: Boolean? = null,
    val latestVersion: String? = null,
    val currentVersion: String? = null,
    val downloadUrl: String? = null,
    val updateType: String? = null,
    val title: String? = null,
    val description: String? = null,
    val fileSize: Int? = null,
    val forceUpdate: Boolean? = null
)
