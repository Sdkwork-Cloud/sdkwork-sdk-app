package com.sdkwork.app

data class UISettingsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val theme: String? = null,
    val language: String? = null,
    val fontSize: String? = null,
    val zoomLevel: Int? = null,
    val notificationsEnabled: Boolean? = null,
    val shortcutsEnabled: Boolean? = null,
    val sidebarState: String? = null,
    val autoSaveEnabled: Boolean? = null
)
