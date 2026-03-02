package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AssetsApi(private val client: HttpClient) {

    /** 重命名资产 */
    suspend fun renameAsset(assetId: String, body: AssetRenameForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/assets/$assetId/rename"), body) as? PlusApiResultVoid
    }

    /** 移动资产 */
    suspend fun moveAsset(assetId: String, body: AssetMoveForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/assets/$assetId/move"), body) as? PlusApiResultVoid
    }

    /** 收藏资产 */
    suspend fun favoriteAsset(assetId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/assets/$assetId/favorite"), null) as? PlusApiResultVoid
    }

    /** 取消收藏 */
    suspend fun unfavoriteAsset(assetId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/assets/$assetId/favorite")) as? PlusApiResultVoid
    }

    /** 获取文件夹列表 */
    suspend fun listFolders(): PlusApiResultListFolderVO? {
        return client.get(ApiPaths.appPath("/assets/folders")) as? PlusApiResultListFolderVO
    }

    /** 创建文件夹 */
    suspend fun createFolder(body: FolderCreateForm): PlusApiResultFolderVO? {
        return client.post(ApiPaths.appPath("/assets/folders"), body) as? PlusApiResultFolderVO
    }

    /** 获取资产列表 */
    suspend fun listAssets(params: Map<String, Any>? = null): PlusApiResultPageAssetVO? {
        return client.get(ApiPaths.appPath("/assets"), params) as? PlusApiResultPageAssetVO
    }

    /** 获取资产详情 */
    suspend fun getAssetDetail(assetId: String): PlusApiResultAssetDetailVO? {
        return client.get(ApiPaths.appPath("/assets/$assetId")) as? PlusApiResultAssetDetailVO
    }

    /** 删除资产 */
    suspend fun deleteAsset(assetId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/assets/$assetId")) as? PlusApiResultVoid
    }

    /** 下载资产 */
    suspend fun getDownloadUrl(assetId: String, params: Map<String, Any>? = null): PlusApiResultDownloadUrlVO? {
        return client.get(ApiPaths.appPath("/assets/$assetId/download"), params) as? PlusApiResultDownloadUrlVO
    }

    /** 获取资产统计 */
    suspend fun getStatistics(): PlusApiResultAssetStatisticsVO? {
        return client.get(ApiPaths.appPath("/assets/statistics")) as? PlusApiResultAssetStatisticsVO
    }

    /** 删除文件夹 */
    suspend fun deleteFolder(folderId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/assets/folders/$folderId")) as? PlusApiResultVoid
    }

    /** 批量删除资产 */
    suspend fun batchDelete(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/assets/batch")) as? PlusApiResultVoid
    }
}
