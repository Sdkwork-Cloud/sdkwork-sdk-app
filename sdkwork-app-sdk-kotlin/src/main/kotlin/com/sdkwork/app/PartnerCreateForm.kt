package com.sdkwork.app

data class PartnerCreateForm(
    val name: String? = null,
    val contactName: String? = null,
    val contactPhone: String? = null,
    val contactEmail: String? = null,
    val level: String? = null,
    val parentId: Int? = null
)
