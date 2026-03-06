package com.sdkwork.app

data class ContactGroupVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val name: String? = null,
    val memberIds: List<String>? = null
)
