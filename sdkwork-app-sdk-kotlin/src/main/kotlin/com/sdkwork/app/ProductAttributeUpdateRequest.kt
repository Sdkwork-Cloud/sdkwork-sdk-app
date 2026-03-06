package com.sdkwork.app

data class ProductAttributeUpdateRequest(
    val name: String? = null,
    val values: List<String>? = null,
    val searchable: Boolean? = null,
    val filterable: Boolean? = null,
    val sort: Int? = null
)
