package com.sdkwork.app

data class AppUpdateForm(
    val name: String? = null,
    val description: String? = null,
    val accessUrl: String? = null,
    val version: String? = null,
    val iconUrl: String? = null,
    val config: AppConfig? = null,
    val platforms: AppPlatforms? = null,
    val installPlatforms: AppPlatforms? = null,
    val installSkill: AppInstallSkill? = null,
    val installConfig: AppInstallConfig? = null,
    val packageName: String? = null,
    val bundleId: String? = null,
    val storeUrl: String? = null,
    val downloadUrl: String? = null
)
