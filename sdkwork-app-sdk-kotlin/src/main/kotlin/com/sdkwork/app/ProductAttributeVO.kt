package com.sdkwork.app

data class ProductAttributeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: String? = null,
    val name: String? = null,
    val values: List<String>? = null,
    val searchable: Boolean? = null,
    val filterable: Boolean? = null,
    val sort: Int? = null
)
