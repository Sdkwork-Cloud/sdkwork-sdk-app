package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class CartApi(private val client: HttpClient) {

    /** 更新购物车商品数量 */
    suspend fun updateItemQuantity(itemId: String, body: UpdateCartItemForm): PlusApiResultCartItemVO? {
        return client.put(ApiPaths.appPath("/cart/items/$itemId"), body) as? PlusApiResultCartItemVO
    }

    /** 删除购物车商品 */
    suspend fun removeItem(itemId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/cart/items/$itemId")) as? PlusApiResultVoid
    }

    /** 更新商品选中状态 */
    suspend fun updateItemSelection(itemId: String, params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/cart/items/$itemId/select"), null, params) as? PlusApiResultVoid
    }

    /** 批量更新选中状态 */
    suspend fun batchUpdateSelection(body: BatchSelectForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/cart/items/select"), body) as? PlusApiResultVoid
    }

    /** 获取购物车商品列表 */
    suspend fun getCartItems(): PlusApiResultListCartItemVO? {
        return client.get(ApiPaths.appPath("/cart/items")) as? PlusApiResultListCartItemVO
    }

    /** 添加商品到购物车 */
    suspend fun addItem(body: AddCartItemForm): PlusApiResultCartItemVO? {
        return client.post(ApiPaths.appPath("/cart/items"), body) as? PlusApiResultCartItemVO
    }

    /** 批量删除购物车商品 */
    suspend fun removeItems(params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/cart/items"), params) as? PlusApiResultVoid
    }

    /** 获取当前用户购物车 */
    suspend fun getMy(): PlusApiResultShoppingCartVO? {
        return client.get(ApiPaths.appPath("/cart")) as? PlusApiResultShoppingCartVO
    }

    /** 清空购物车 */
    suspend fun clear(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/cart")) as? PlusApiResultVoid
    }

    /** 获取购物车统计 */
    suspend fun getCartStatistics(): PlusApiResultCartStatisticsVO? {
        return client.get(ApiPaths.appPath("/cart/statistics")) as? PlusApiResultCartStatisticsVO
    }

    /** 获取选中的商品列表 */
    suspend fun getSelectedItems(): PlusApiResultListCartItemVO? {
        return client.get(ApiPaths.appPath("/cart/items/selected")) as? PlusApiResultListCartItemVO
    }

    /** 检查商品是否在购物车中 */
    suspend fun checkItemIn(params: Map<String, Any>? = null): PlusApiResultBoolean? {
        return client.get(ApiPaths.appPath("/cart/check"), params) as? PlusApiResultBoolean
    }
}
