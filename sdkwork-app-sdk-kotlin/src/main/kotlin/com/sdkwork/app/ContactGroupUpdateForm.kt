package com.sdkwork.app

data class ContactGroupUpdateForm(
    val name: String? = null,
    val memberIds: List<String>? = null
)
