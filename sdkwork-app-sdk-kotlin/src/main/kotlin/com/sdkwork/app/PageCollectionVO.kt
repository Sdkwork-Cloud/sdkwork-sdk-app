package com.sdkwork.app

data class PageCollectionVO(
    val totalPages: Int? = null,
    val totalElements: Int? = null,
    val size: Int? = null,
    val content: List<CollectionVO>? = null,
    val number: Int? = null,
    val sort: SortObject? = null,
    val first: Boolean? = null,
    val last: Boolean? = null,
    val numberOfElements: Int? = null,
    val pageable: PageableObject? = null,
    val empty: Boolean? = null
)
