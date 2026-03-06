package com.sdkwork.app

data class SkillMarketQueryForm(
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortField: String? = null,
    val sortDirection: String? = null,
    val categoryId: Int? = null,
    val packageId: Int? = null,
    val keyword: String? = null,
    val sortBy: String? = null,
    val size: Int? = null,
    val page: Int? = null
)
