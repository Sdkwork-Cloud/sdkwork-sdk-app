package com.sdkwork.app

data class RecentActivityVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val type: String? = null,
    val title: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val url: String? = null,
    val status: String? = null,
    val resourceId: String? = null,
    val resourceType: String? = null,
    val creator: String? = null,
    val createTime: String? = null,
    val read: Boolean? = null,
    val priority: Int? = null
)
