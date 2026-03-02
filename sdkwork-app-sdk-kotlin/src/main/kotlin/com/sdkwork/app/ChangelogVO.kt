package com.sdkwork.app

data class ChangelogVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val version: String? = null,
    val releaseDate: String? = null,
    val title: String? = null,
    val features: List<String>? = null,
    val bugFixes: List<String>? = null,
    val improvements: List<String>? = null,
    val status: String? = null,
    val downloadUrl: String? = null
)
