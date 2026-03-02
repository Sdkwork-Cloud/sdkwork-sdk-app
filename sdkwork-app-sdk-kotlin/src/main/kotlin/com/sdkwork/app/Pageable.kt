package com.sdkwork.app

data class Pageable(
    val page: Int? = null,
    val size: Int? = null,
    val sort: List<String>? = null
)
