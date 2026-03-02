package com.sdkwork.app

data class DepartmentVO(
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
    val fullPathName: String? = null
)
