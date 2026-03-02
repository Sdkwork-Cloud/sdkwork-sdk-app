package com.sdkwork.app

data class CurrencyCreateForm(
    val code: String? = null,
    val name: String? = null,
    val symbol: String? = null,
    val currencyType: String? = null,
    val precisionDigits: Int? = null,
    val isActive: Boolean? = null,
    val description: String? = null
)
