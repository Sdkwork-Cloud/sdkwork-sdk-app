package com.sdkwork.app

data class AppVersionVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val currentVersion: String? = null,
    val latestVersion: String? = null,
    val updateRequired: Boolean? = null,
    val forceUpdate: Boolean? = null,
    val updateDescription: String? = null,
    val updateUrl: String? = null,
    val updateSize: String? = null,
    val releaseDate: Int? = null
)
