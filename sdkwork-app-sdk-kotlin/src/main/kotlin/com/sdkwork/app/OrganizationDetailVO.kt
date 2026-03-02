package com.sdkwork.app

data class OrganizationDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val name: String? = null,
    val code: String? = null,
    val status: String? = null,
    val description: String? = null,
    val parentId: Int? = null,
    val contactPerson: String? = null,
    val contactPhone: String? = null,
    val contactEmail: String? = null,
    val address: String? = null,
    val website: String? = null,
    val logoUrl: String? = null,
    val metadata: OrganizationMetadata? = null,
    val installAppList: InstallAppList? = null,
    val memberCount: Int? = null,
    val departmentCount: Int? = null,
    val positionCount: Int? = null
)
