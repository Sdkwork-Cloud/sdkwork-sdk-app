package com.sdkwork.app

data class SkillPackageVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val packageId: Int? = null,
    val packageKey: String? = null,
    val name: String? = null,
    val summary: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val coverImage: String? = null,
    val categoryId: Int? = null,
    val categoryName: String? = null,
    val tags: List<String>? = null,
    val featured: Boolean? = null,
    val sortWeight: Int? = null,
    val skillCount: Int? = null
)
