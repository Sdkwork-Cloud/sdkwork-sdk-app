package com.sdkwork.app

data class ContactQueryForm(
    val keyword: String? = null,
    val region: String? = null,
    val isOnline: Boolean? = null
)
