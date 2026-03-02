package com.sdkwork.app

data class ShortcutVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val name: String? = null,
    val icon: String? = null,
    val url: String? = null,
    val type: String? = null,
    val sort: Int? = null,
    val group: String? = null,
    val description: String? = null,
    val isDefault: Boolean? = null,
    val enabled: Boolean? = null,
    val usageCount: Int? = null,
    val lastUsedAt: String? = null
)
