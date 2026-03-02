package com.sdkwork.app

data class PositionCreateForm(
    val name: String? = null,
    val code: String? = null,
    val description: String? = null,
    val ownerId: Int? = null,
    val parentId: Int? = null,
    val level: Int? = null,
    val sortOrder: Int? = null,
    val category: String? = null,
    val requiredExperienceYears: Int? = null,
    val requiredEducation: String? = null,
    val maxMemberCount: Int? = null
)
