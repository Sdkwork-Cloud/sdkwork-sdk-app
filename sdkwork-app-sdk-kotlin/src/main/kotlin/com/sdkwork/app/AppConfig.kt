package com.sdkwork.app

data class AppConfig(
    val officialAccount: OfficialAccountConfig? = null,
    val publish: AppPublishConfig? = null
)
