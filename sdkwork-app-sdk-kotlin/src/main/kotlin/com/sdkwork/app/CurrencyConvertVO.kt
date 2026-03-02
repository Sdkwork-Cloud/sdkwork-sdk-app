package com.sdkwork.app

data class CurrencyConvertVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val baseCurrencyCode: String? = null,
    val targetCurrencyCode: String? = null,
    val originalAmount: Double? = null,
    val rate: Double? = null,
    val convertedAmount: Double? = null
)
