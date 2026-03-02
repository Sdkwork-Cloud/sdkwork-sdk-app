package com.sdkwork.app

data class PositionDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val name: String? = null,
    val code: String? = null,
    val description: String? = null,
    val ownerId: Int? = null,
    val parentId: Int? = null,
    val level: Int? = null,
    val isActive: Boolean? = null,
    val sortOrder: Int? = null,
    val treePath: TreeNodePath? = null,
    val fullPathName: String? = null,
    val category: String? = null,
    val levelName: String? = null,
    val requiredExperienceYears: Int? = null,
    val requiredEducation: String? = null,
    val maxMemberCount: Int? = null,
    val currentMemberCount: Int? = null,
    val isFull: Boolean? = null
)
