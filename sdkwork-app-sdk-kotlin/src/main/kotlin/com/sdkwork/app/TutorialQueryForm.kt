package com.sdkwork.app

data class TutorialQueryForm(
    val categoryId: String? = null,
    val keyword: String? = null,
    val page: Int? = null,
    val size: Int? = null
)
