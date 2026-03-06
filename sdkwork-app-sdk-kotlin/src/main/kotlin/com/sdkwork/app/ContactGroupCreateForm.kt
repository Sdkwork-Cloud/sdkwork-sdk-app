package com.sdkwork.app

data class ContactGroupCreateForm(
    val name: String? = null,
    val memberIds: List<String>? = null
)
