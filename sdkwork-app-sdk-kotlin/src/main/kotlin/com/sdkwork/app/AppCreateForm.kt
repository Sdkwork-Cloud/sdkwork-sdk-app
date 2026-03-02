package com.sdkwork.app

data class AppCreateForm(
    val name: String? = null,
    val description: String? = null,
    val appType: String? = null,
    val projectId: Int? = null
)
