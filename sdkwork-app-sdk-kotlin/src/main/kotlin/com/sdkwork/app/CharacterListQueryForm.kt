package com.sdkwork.app

data class CharacterListQueryForm(
    val style: String? = null,
    val keyword: String? = null,
    val pageNum: Int? = null,
    val pageSize: Int? = null,
    val sortBy: String? = null,
    val sortOrder: String? = null
)
