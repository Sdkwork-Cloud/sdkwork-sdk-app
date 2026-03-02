package com.sdkwork.app

data class OrganizationCreateForm(
    val name: String? = null,
    val code: String? = null,
    val description: String? = null,
    val parentId: Int? = null,
    val contactPerson: String? = null,
    val contactPhone: String? = null,
    val contactEmail: String? = null,
    val address: String? = null,
    val website: String? = null,
    val logoUrl: String? = null
)
