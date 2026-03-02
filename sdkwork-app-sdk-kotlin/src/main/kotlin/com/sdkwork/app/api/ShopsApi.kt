package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ShopsApi(private val client: HttpClient) {

    /** 获取店铺详情 */
    suspend fun getShopDetail(shopId: String): PlusApiResultShopDetailVO? {
        return client.get(ApiPaths.appPath("/shops/$shopId")) as? PlusApiResultShopDetailVO
    }

    /** 更新店铺 */
    suspend fun updateShop(shopId: String, body: ShopUpdateForm): PlusApiResultShopVO? {
        return client.put(ApiPaths.appPath("/shops/$shopId"), body) as? PlusApiResultShopVO
    }

    /** 删除店铺 */
    suspend fun deleteShop(shopId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/shops/$shopId")) as? PlusApiResultVoid
    }

    /** 更新店铺状态 */
    suspend fun updateStatus(shopId: String, params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/shops/$shopId/status"), null, params) as? PlusApiResultVoid
    }

    /** 开店营业 */
    suspend fun openShop(shopId: String): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/shops/$shopId/open"), null) as? PlusApiResultVoid
    }

    /** 关店休息 */
    suspend fun closeShop(shopId: String): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/shops/$shopId/close"), null) as? PlusApiResultVoid
    }

    /** 获取店铺列表 */
    suspend fun listShops(params: Map<String, Any>? = null): PlusApiResultPageShopVO? {
        return client.get(ApiPaths.appPath("/shops"), params) as? PlusApiResultPageShopVO
    }

    /** 创建店铺 */
    suspend fun createShop(body: ShopCreateForm): PlusApiResultShopVO? {
        return client.post(ApiPaths.appPath("/shops"), body) as? PlusApiResultShopVO
    }

    /** 获取店铺统计 */
    suspend fun getStatistics(): PlusApiResultShopStatisticsVO? {
        return client.get(ApiPaths.appPath("/shops/statistics")) as? PlusApiResultShopStatisticsVO
    }

    /** 获取所有激活店铺 */
    suspend fun listAllActive(): PlusApiResultListShopVO? {
        return client.get(ApiPaths.appPath("/shops/all")) as? PlusApiResultListShopVO
    }
}
