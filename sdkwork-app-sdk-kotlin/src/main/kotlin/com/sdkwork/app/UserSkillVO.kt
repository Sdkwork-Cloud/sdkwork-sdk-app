package com.sdkwork.app

data class UserSkillVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userSkillId: Int? = null,
    val skillId: Int? = null,
    val enabled: Boolean? = null,
    val config: Map<String, Any>? = null,
    val installedAt: String? = null,
    val lastEnabledAt: String? = null,
    val lastUsedAt: String? = null,
    val usedCount: Int? = null,
    val skill: SkillVO? = null
)
