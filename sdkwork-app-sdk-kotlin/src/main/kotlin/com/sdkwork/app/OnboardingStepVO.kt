package com.sdkwork.app

data class OnboardingStepVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val title: String? = null,
    val description: String? = null,
    val order: Int? = null,
    val completed: Boolean? = null,
    val completeTime: String? = null
)
