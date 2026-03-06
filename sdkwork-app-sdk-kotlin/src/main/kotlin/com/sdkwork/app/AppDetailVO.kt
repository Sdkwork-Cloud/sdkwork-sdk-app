package com.sdkwork.app

data class AppDetailVO(
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
    val platforms: AppPlatforms? = null,
    val installPlatforms: AppPlatforms? = null,
    val installSkill: AppInstallSkill? = null,
    val installConfig: AppInstallConfig? = null,
    val config: AppConfig? = null,
    val packageName: String? = null,
    val bundleId: String? = null,
    val storeUrl: String? = null,
    val downloadUrl: String? = null
)
