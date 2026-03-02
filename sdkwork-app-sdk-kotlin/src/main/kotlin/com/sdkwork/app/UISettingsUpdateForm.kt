package com.sdkwork.app

data class UISettingsUpdateForm(
    val theme: String? = null,
    val language: String? = null,
    val fontSize: String? = null,
    val zoomLevel: Int? = null,
    val notificationsEnabled: Boolean? = null,
    val shortcutsEnabled: Boolean? = null,
    val sidebarState: String? = null,
    val autoSaveEnabled: Boolean? = null
)
