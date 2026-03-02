package com.sdkwork.app

data class PointsExchangeRecordVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val recordId: String? = null,
    val goodsId: String? = null,
    val goodsName: String? = null,
    val goodsImage: String? = null,
    val quantity: Int? = null,
    val pointsCost: Int? = null,
    val exchangeTime: String? = null,
    val status: String? = null,
    val deliverTime: String? = null,
    val logisticsInfo: String? = null,
    val remark: String? = null
)
