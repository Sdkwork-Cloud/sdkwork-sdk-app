package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class SkuApi(private val client: HttpClient) {

    /** 获取SKU详情 */
    suspend fun getSkuDetail(skuId: String): PlusApiResultSkuDetailVO? {
        return client.get(ApiPaths.appPath("/skus/$skuId")) as? PlusApiResultSkuDetailVO
    }

    /** 获取SKU库存 */
    suspend fun getSkuStock(skuId: String): PlusApiResultSkuStockVO? {
        return client.get(ApiPaths.appPath("/skus/$skuId/stock")) as? PlusApiResultSkuStockVO
    }

    /** 检查SKU库存 */
    suspend fun checkSkuStock(skuId: String, params: Map<String, Any>? = null): PlusApiResultBoolean? {
        return client.get(ApiPaths.appPath("/skus/$skuId/check-stock"), params) as? PlusApiResultBoolean
    }

    /** 获取产品的SKU列表 */
    suspend fun getSkuByProduct(productId: String, params: Map<String, Any>? = null): PlusApiResultPageSkuVO? {
        return client.get(ApiPaths.appPath("/skus/product/$productId"), params) as? PlusApiResultPageSkuVO
    }

    /** 获取产品SKU统计 */
    suspend fun getSkuStatistics(productId: String): PlusApiResultSkuStatisticsVO? {
        return client.get(ApiPaths.appPath("/skus/product/$productId/statistics")) as? PlusApiResultSkuStatisticsVO
    }

    /** 检查SKU编码是否存在 */
    suspend fun checkSkuCodeExists(params: Map<String, Any>? = null): PlusApiResultBoolean? {
        return client.get(ApiPaths.appPath("/skus/exists"), params) as? PlusApiResultBoolean
    }

    /** 按编码获取SKU */
    suspend fun getSkuByCode(skuCode: String): PlusApiResultSkuVO? {
        return client.get(ApiPaths.appPath("/skus/code/$skuCode")) as? PlusApiResultSkuVO
    }

    /** 批量获取SKU */
    suspend fun batchGetSkus(params: Map<String, Any>? = null): PlusApiResultListSkuVO? {
        return client.get(ApiPaths.appPath("/skus/batch"), params) as? PlusApiResultListSkuVO
    }
}
