package com.sdkwork.app

data class SettingsUpdateForm(
    val settings: Map<String, Any>? = null,
    val module: String? = null,
    val overwrite: Boolean? = null
)
