package com.sdkwork.app

data class ExchangeRateVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val baseCurrencyCode: String? = null,
    val baseCurrencyName: String? = null,
    val targetCurrencyCode: String? = null,
    val targetCurrencyName: String? = null,
    val rate: Double? = null,
    val effectiveDate: String? = null
)
