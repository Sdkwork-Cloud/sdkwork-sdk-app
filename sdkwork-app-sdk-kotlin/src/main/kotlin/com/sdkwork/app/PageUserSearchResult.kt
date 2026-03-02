package com.sdkwork.app

data class PageUserSearchResult(
    val totalPages: Int? = null,
    val totalElements: Int? = null,
    val size: Int? = null,
    val content: List<UserSearchResult>? = null,
    val number: Int? = null,
    val sort: SortObject? = null,
    val first: Boolean? = null,
    val last: Boolean? = null,
    val numberOfElements: Int? = null,
    val pageable: PageableObject? = null,
    val empty: Boolean? = null
)
