package com.sdkwork.app

data class NotificationQueryForm(
    val type: String? = null,
    val read: Boolean? = null,
    val page: Int? = null,
    val size: Int? = null,
    val sortBy: String? = null,
    val sortDirection: String? = null
)
