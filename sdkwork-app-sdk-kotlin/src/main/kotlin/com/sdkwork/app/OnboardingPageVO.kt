package com.sdkwork.app

data class OnboardingPageVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val pageId: String? = null,
    val title: String? = null,
    val description: String? = null,
    val images: List<String>? = null,
    val buttons: List<String>? = null,
    val backgroundColor: String? = null,
    val textColor: String? = null,
    val isActive: Boolean? = null,
    val order: Int? = null
)
