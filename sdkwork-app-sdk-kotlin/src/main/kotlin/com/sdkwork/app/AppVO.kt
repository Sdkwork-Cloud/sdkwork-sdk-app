package com.sdkwork.app

data class AppVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val appId: String? = null,
    val name: String? = null,
    val description: String? = null,
    val icon: ImageMediaResource? = null,
    val iconUrl: String? = null,
    val accessUrl: String? = null,
    val version: String? = null,
    val appType: String? = null,
    val status: String? = null,
    val projectId: Int? = null,
    val installSkill: AppInstallSkill? = null
)
