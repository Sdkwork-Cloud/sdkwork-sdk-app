package com.sdkwork.app

data class GenerationStyleDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val styleId: String? = null,
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val configParams: Map<String, Any>? = null,
    val tags: TagsContent? = null,
    val coverImage: ImageMediaResource? = null,
    val assets: AssetMediaResourceList? = null,
    val previewImage: ImageMediaResource? = null,
    val isPublic: Boolean? = null,
    val status: String? = null,
    val usageCount: Int? = null
)
