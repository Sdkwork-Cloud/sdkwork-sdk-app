package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class FavoriteApi(private val client: HttpClient) {

    /** 移动收藏 */
    suspend fun moveFavoriteToFolder(favoriteId: String, body: FavoriteMoveForm): PlusApiResultFavoriteVO? {
        return client.put(ApiPaths.appPath("/favorite/$favoriteId/move"), body) as? PlusApiResultFavoriteVO
    }

    /** 更新收藏夹 */
    suspend fun updateFavoriteFolder(folderId: String, body: FavoriteFolderUpdateForm): PlusApiResultFavoriteFolderVO? {
        return client.put(ApiPaths.appPath("/favorite/folders/$folderId"), body) as? PlusApiResultFavoriteFolderVO
    }

    /** 删除收藏夹 */
    suspend fun deleteFavoriteFolder(folderId: String, params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/favorite/folders/$folderId"), params) as? PlusApiResultVoid
    }

    /** 批量移动收藏 */
    suspend fun batchMoveFavorites(body: FavoriteBatchMoveForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/favorite/batch/move"), body) as? PlusApiResultVoid
    }

    /** 收藏列表 */
    suspend fun listFavorites(params: Map<String, Any>? = null): PlusApiResultPageFavoriteItemVO? {
        return client.get(ApiPaths.appPath("/favorite"), params) as? PlusApiResultPageFavoriteItemVO
    }

    /** 添加收藏 */
    suspend fun add(body: FavoriteAddForm): PlusApiResultFavoriteVO? {
        return client.post(ApiPaths.appPath("/favorite"), body) as? PlusApiResultFavoriteVO
    }

    /** 收藏夹列表 */
    suspend fun listFavoriteFolders(): PlusApiResultListFavoriteFolderVO? {
        return client.get(ApiPaths.appPath("/favorite/folders")) as? PlusApiResultListFavoriteFolderVO
    }

    /** 创建收藏夹 */
    suspend fun createFavoriteFolder(body: FavoriteFolderCreateForm): PlusApiResultFavoriteFolderVO? {
        return client.post(ApiPaths.appPath("/favorite/folders"), body) as? PlusApiResultFavoriteFolderVO
    }

    /** 批量检查收藏 */
    suspend fun batchCheckFavorites(body: FavoriteBatchCheckForm): PlusApiResultListFavoriteCheckVO? {
        return client.post(ApiPaths.appPath("/favorite/batch-check"), body) as? PlusApiResultListFavoriteCheckVO
    }

    /** 收藏详情 */
    suspend fun getFavoriteDetail(favoriteId: String): PlusApiResultFavoriteDetailVO? {
        return client.get(ApiPaths.appPath("/favorite/$favoriteId")) as? PlusApiResultFavoriteDetailVO
    }

    /** 取消收藏 */
    suspend fun remove(favoriteId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/favorite/$favoriteId")) as? PlusApiResultVoid
    }

    /** 收藏统计 */
    suspend fun getFavoriteStatistics(): PlusApiResultFavoriteStatisticsVO? {
        return client.get(ApiPaths.appPath("/favorite/statistics")) as? PlusApiResultFavoriteStatisticsVO
    }

    /** 最近收藏 */
    suspend fun getRecentFavorites(params: Map<String, Any>? = null): PlusApiResultListFavoriteItemVO? {
        return client.get(ApiPaths.appPath("/favorite/recent"), params) as? PlusApiResultListFavoriteItemVO
    }

    /** 各类型收藏数 */
    suspend fun getFavoriteCountByType(): PlusApiResultListFavoriteTypeCountVO? {
        return client.get(ApiPaths.appPath("/favorite/count/by-type")) as? PlusApiResultListFavoriteTypeCountVO
    }

    /** 检查收藏状态 */
    suspend fun check(params: Map<String, Any>? = null): PlusApiResultFavoriteCheckVO? {
        return client.get(ApiPaths.appPath("/favorite/check"), params) as? PlusApiResultFavoriteCheckVO
    }

    /** 按目标取消收藏 */
    suspend fun removeFavoriteByTarget(params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/favorite/by-target"), params) as? PlusApiResultVoid
    }

    /** 批量取消收藏 */
    suspend fun batchRemoveFavorites(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/favorite/batch")) as? PlusApiResultVoid
    }
}
