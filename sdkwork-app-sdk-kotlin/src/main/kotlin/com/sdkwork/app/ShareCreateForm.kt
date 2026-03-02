package com.sdkwork.app

data class ShareCreateForm(
    val shareType: String? = null,
    val contentId: String? = null,
    val title: String? = null,
    val description: String? = null,
    val imageUrl: String? = null,
    val expireSeconds: Int? = null,
    val passwordRequired: Boolean? = null,
    val password: String? = null,
    val channel: String? = null
)
