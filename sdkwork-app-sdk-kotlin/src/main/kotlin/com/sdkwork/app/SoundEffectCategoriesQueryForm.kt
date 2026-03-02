package com.sdkwork.app

data class SoundEffectCategoriesQueryForm(
    val parentCategory: String? = null,
    val language: String? = null,
    val includeSubcategories: Boolean? = null
)
