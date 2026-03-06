package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class DriveApi(private val client: HttpClient) {

    /** Restore drive item */
    suspend fun restoreItem(itemId: String): PlusApiResultDriveItemVO? {
        return client.put(ApiPaths.appPath("/drive/items/$itemId/restore"), null) as? PlusApiResultDriveItemVO
    }

    /** Rename drive item */
    suspend fun renameItem(itemId: String, body: DriveRenameForm): PlusApiResultDriveItemVO? {
        return client.put(ApiPaths.appPath("/drive/items/$itemId/rename"), body) as? PlusApiResultDriveItemVO
    }

    /** Move drive item */
    suspend fun moveItem(itemId: String, body: DriveMoveForm): PlusApiResultDriveItemVO? {
        return client.put(ApiPaths.appPath("/drive/items/$itemId/move"), body) as? PlusApiResultDriveItemVO
    }

    /** Get drive file content */
    suspend fun getItemContent(itemId: String): PlusApiResultDriveContentVO? {
        return client.get(ApiPaths.appPath("/drive/items/$itemId/content")) as? PlusApiResultDriveContentVO
    }

    /** Update drive file content */
    suspend fun updateItemContent(itemId: String, body: DriveContentUpdateForm): PlusApiResultDriveContentVO? {
        return client.put(ApiPaths.appPath("/drive/items/$itemId/content"), body) as? PlusApiResultDriveContentVO
    }

    /** Archive drive item */
    suspend fun archiveItem(itemId: String): PlusApiResultDriveItemVO? {
        return client.put(ApiPaths.appPath("/drive/items/$itemId/archive"), null) as? PlusApiResultDriveItemVO
    }

    /** Favorite drive item */
    suspend fun favoriteItem(itemId: String): PlusApiResultDriveItemVO? {
        return client.post(ApiPaths.appPath("/drive/items/$itemId/favorite"), null) as? PlusApiResultDriveItemVO
    }

    /** Unfavorite drive item */
    suspend fun unfavoriteItem(itemId: String): PlusApiResultDriveItemVO? {
        return client.delete(ApiPaths.appPath("/drive/items/$itemId/favorite")) as? PlusApiResultDriveItemVO
    }

    /** Copy drive item */
    suspend fun copyItem(itemId: String, body: DriveCopyForm): PlusApiResultDriveItemVO? {
        return client.post(ApiPaths.appPath("/drive/items/$itemId/copy"), body) as? PlusApiResultDriveItemVO
    }

    /** Batch delete drive items */
    suspend fun batchDeleteItems(body: DriveBatchDeleteForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/drive/items/batch-delete"), body) as? PlusApiResultVoid
    }

    /** Create drive folder */
    suspend fun createFolder(body: DriveFolderCreateForm): PlusApiResultDriveItemVO? {
        return client.post(ApiPaths.appPath("/drive/folders"), body) as? PlusApiResultDriveItemVO
    }

    /** List drive items */
    suspend fun listItems(params: Map<String, Any>? = null): PlusApiResultPageDriveItemVO? {
        return client.get(ApiPaths.appPath("/drive/items"), params) as? PlusApiResultPageDriveItemVO
    }

    /** Get drive item detail */
    suspend fun getItemDetail(itemId: String): PlusApiResultDriveItemDetailVO? {
        return client.get(ApiPaths.appPath("/drive/items/$itemId")) as? PlusApiResultDriveItemDetailVO
    }

    /** Delete drive item */
    suspend fun deleteItem(itemId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/drive/items/$itemId")) as? PlusApiResultVoid
    }
}
