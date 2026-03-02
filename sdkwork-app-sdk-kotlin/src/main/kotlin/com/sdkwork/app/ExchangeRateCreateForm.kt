package com.sdkwork.app

data class ExchangeRateCreateForm(
    val baseCurrencyCode: String? = null,
    val targetCurrencyCode: String? = null,
    val rate: Double? = null,
    val effectiveDate: String? = null
)
