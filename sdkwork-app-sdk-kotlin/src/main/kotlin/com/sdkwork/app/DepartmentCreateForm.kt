package com.sdkwork.app

data class DepartmentCreateForm(
    val name: String? = null,
    val code: String? = null,
    val description: String? = null,
    val ownerId: Int? = null,
    val parentId: Int? = null,
    val sortOrder: Int? = null,
    val managerId: Int? = null,
    val phone: String? = null,
    val email: String? = null
)
