package com.sdkwork.app

data class AddCartItemForm(
    val skuId: Int? = null,
    val productId: Int? = null,
    val quantity: Int? = null,
    val cartGroupUuid: String? = null
)
