package com.sdkwork.app

data class GenerationStatisticsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val todayCount: Int? = null,
    val weekCount: Int? = null,
    val monthCount: Int? = null,
    val totalCount: Int? = null,
    val avgGenerationTime: Int? = null,
    val maxGenerationTime: Int? = null,
    val minGenerationTime: Int? = null,
    val successRate: Double? = null,
    val mostUsedModel: String? = null,
    val typeDistribution: GenerationTypeDistributionVO? = null
)
