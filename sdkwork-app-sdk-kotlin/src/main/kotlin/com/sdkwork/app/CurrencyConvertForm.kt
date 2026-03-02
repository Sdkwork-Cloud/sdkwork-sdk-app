package com.sdkwork.app

data class CurrencyConvertForm(
    val baseCurrencyCode: String? = null,
    val targetCurrencyCode: String? = null,
    val amount: Double? = null
)
