package com.sdkwork.app

data class ChartDataVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val type: String? = null,
    val title: String? = null,
    val labels: List<String>? = null,
    val datasets: List<DatasetVO>? = null,
    val config: ChartConfigVO? = null
)
