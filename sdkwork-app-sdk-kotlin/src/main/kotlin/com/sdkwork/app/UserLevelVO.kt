package com.sdkwork.app

data class UserLevelVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val name: String? = null,
    val icon: String? = null,
    val description: String? = null,
    val level: Int? = null,
    val currentExp: Int? = null,
    val requiredExp: Int? = null,
    val expProgress: Double? = null,
    val privileges: List<PrivilegeVO>? = null,
    val validUntil: String? = null,
    val status: String? = null
)
