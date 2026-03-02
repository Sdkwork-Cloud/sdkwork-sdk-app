package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class CollectionApi(private val client: HttpClient) {

    /** 获取合集详情 */
    suspend fun getCollection(collectionId: String): PlusApiResultCollectionDetailVO? {
        return client.get(ApiPaths.appPath("/collection/$collectionId")) as? PlusApiResultCollectionDetailVO
    }

    /** 更新合集 */
    suspend fun updateCollection(collectionId: String, body: CollectionUpdateForm): PlusApiResultCollectionVO? {
        return client.put(ApiPaths.appPath("/collection/$collectionId"), body) as? PlusApiResultCollectionVO
    }

    /** 删除合集 */
    suspend fun deleteCollection(collectionId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/collection/$collectionId")) as? PlusApiResultVoid
    }

    /** 更新内容排序 */
    suspend fun updateItemPositions(collectionId: String, body: CollectionItemPositionForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/collection/$collectionId/items/positions"), body) as? PlusApiResultVoid
    }

    /** 创建合集 */
    suspend fun createCollection(body: CollectionCreateForm): PlusApiResultCollectionVO? {
        return client.post(ApiPaths.appPath("/collection"), body) as? PlusApiResultCollectionVO
    }

    /** 获取合集内容列表 */
    suspend fun getCollectionItems(collectionId: String, params: Map<String, Any>? = null): PlusApiResultListCollectionItemVO? {
        return client.get(ApiPaths.appPath("/collection/$collectionId/items"), params) as? PlusApiResultListCollectionItemVO
    }

    /** 添加内容到合集 */
    suspend fun addItem(collectionId: String, body: CollectionItemAddForm): PlusApiResultCollectionItemVO? {
        return client.post(ApiPaths.appPath("/collection/$collectionId/items"), body) as? PlusApiResultCollectionItemVO
    }

    /** 置顶内容 */
    suspend fun pinItem(collectionId: String, itemId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/collection/$collectionId/items/$itemId/pin"), null) as? PlusApiResultVoid
    }

    /** 取消置顶 */
    suspend fun unpinItem(collectionId: String, itemId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/collection/$collectionId/items/$itemId/pin")) as? PlusApiResultVoid
    }

    /** 获取合集路径 */
    suspend fun getCollectionPath(collectionId: String): PlusApiResultListCollectionVO? {
        return client.get(ApiPaths.appPath("/collection/$collectionId/path")) as? PlusApiResultListCollectionVO
    }

    /** 获取合集树 */
    suspend fun getCollectionTree(params: Map<String, Any>? = null): PlusApiResultListCollectionTreeVO? {
        return client.get(ApiPaths.appPath("/collection/tree"), params) as? PlusApiResultListCollectionTreeVO
    }

    /** 搜索合集 */
    suspend fun searchCollections(params: Map<String, Any>? = null): PlusApiResultPageCollectionVO? {
        return client.get(ApiPaths.appPath("/collection/search"), params) as? PlusApiResultPageCollectionVO
    }

    /** 获取我的合集 */
    suspend fun getMyCollections(params: Map<String, Any>? = null): PlusApiResultPageCollectionVO? {
        return client.get(ApiPaths.appPath("/collection/my"), params) as? PlusApiResultPageCollectionVO
    }

    /** 从合集移除内容 */
    suspend fun removeItem(collectionId: String, contentId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/collection/$collectionId/items/$contentId")) as? PlusApiResultVoid
    }
}
