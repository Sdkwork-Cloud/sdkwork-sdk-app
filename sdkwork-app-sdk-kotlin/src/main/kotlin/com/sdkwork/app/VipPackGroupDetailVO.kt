package com.sdkwork.app

data class VipPackGroupDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val sortWeight: Int? = null,
    val packs: List<VipPackVO>? = null
)
