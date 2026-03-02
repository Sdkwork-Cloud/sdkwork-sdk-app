package com.sdkwork.app

data class ModelStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val totalModels: Int? = null,
    val activeModels: Int? = null,
    val chatModels: Int? = null,
    val imageModels: Int? = null,
    val audioModels: Int? = null
)
