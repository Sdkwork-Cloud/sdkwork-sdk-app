package com.sdkwork.app

data class PointsGoodsQueryForm(
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val category: String? = null,
    val minPoints: Int? = null,
    val maxPoints: Int? = null,
    val exchangeable: Boolean? = null,
    val size: Int? = null,
    val page: Int? = null
)
