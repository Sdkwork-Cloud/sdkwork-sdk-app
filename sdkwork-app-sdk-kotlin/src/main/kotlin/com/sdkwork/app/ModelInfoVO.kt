package com.sdkwork.app

data class ModelInfoVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val modelId: String? = null,
    val model: String? = null,
    val name: String? = null,
    val description: String? = null,
    val channel: String? = null,
    val modelType: String? = null,
    val family: String? = null,
    val version: String? = null,
    val openSource: Boolean? = null,
    val status: String? = null,
    val usageCount: Int? = null
)
