package com.sdkwork.app

data class PaymentMethodVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val code: String? = null,
    val methodId: String? = null,
    val methodName: String? = null,
    val methodIcon: String? = null,
    val enabled: Boolean? = null,
    val sort: Int? = null,
    val icon: String? = null,
    val available: Boolean? = null,
    val productTypes: List<PaymentProductTypeVO>? = null
)
