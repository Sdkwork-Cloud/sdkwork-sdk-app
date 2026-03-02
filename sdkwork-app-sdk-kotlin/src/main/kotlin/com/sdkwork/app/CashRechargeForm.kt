package com.sdkwork.app

data class CashRechargeForm(
    val amount: Double? = null,
    val paymentMethod: String? = null,
    val remarks: String? = null,
    val couponId: String? = null
)
