package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class FileSystemApi(private val client: HttpClient) {

    /** Rename node */
    suspend fun renameNode(nodeId: String, body: FileSystemRenameForm): PlusApiResultFileSystemNodeVO? {
        return client.put(ApiPaths.appPath("/filesystem/nodes/$nodeId/rename"), body) as? PlusApiResultFileSystemNodeVO
    }

    /** Move node */
    suspend fun moveNode(nodeId: String, body: FileSystemMoveForm): PlusApiResultFileSystemNodeVO? {
        return client.put(ApiPaths.appPath("/filesystem/nodes/$nodeId/move"), body) as? PlusApiResultFileSystemNodeVO
    }

    /** Get file content */
    suspend fun getFileContent(fileId: String): PlusApiResultFileSystemContentVO? {
        return client.get(ApiPaths.appPath("/filesystem/files/$fileId/content")) as? PlusApiResultFileSystemContentVO
    }

    /** Update file content */
    suspend fun updateFileContent(fileId: String, body: FileSystemContentUpdateForm): PlusApiResultFileSystemContentVO? {
        return client.put(ApiPaths.appPath("/filesystem/files/$fileId/content"), body) as? PlusApiResultFileSystemContentVO
    }

    /** Copy node */
    suspend fun copyNode(nodeId: String, body: FileSystemCopyForm): PlusApiResultFileSystemNodeVO? {
        return client.post(ApiPaths.appPath("/filesystem/nodes/$nodeId/copy"), body) as? PlusApiResultFileSystemNodeVO
    }

    /** Create folder */
    suspend fun createFolder(body: FileSystemFolderCreateForm): PlusApiResultFileSystemNodeVO? {
        return client.post(ApiPaths.appPath("/filesystem/folders"), body) as? PlusApiResultFileSystemNodeVO
    }

    /** Create file */
    suspend fun createFile(body: FileSystemFileCreateForm): PlusApiResultFileSystemNodeVO? {
        return client.post(ApiPaths.appPath("/filesystem/files"), body) as? PlusApiResultFileSystemNodeVO
    }

    /** List nodes */
    suspend fun listNodes(params: Map<String, Any>? = null): PlusApiResultPageFileSystemNodeVO? {
        return client.get(ApiPaths.appPath("/filesystem/nodes"), params) as? PlusApiResultPageFileSystemNodeVO
    }

    /** Get node detail */
    suspend fun getNodeDetail(nodeId: String): PlusApiResultFileSystemNodeVO? {
        return client.get(ApiPaths.appPath("/filesystem/nodes/$nodeId")) as? PlusApiResultFileSystemNodeVO
    }

    /** Delete node */
    suspend fun deleteNode(nodeId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/filesystem/nodes/$nodeId")) as? PlusApiResultVoid
    }

    /** List disks */
    suspend fun listDisks(): PlusApiResultListFileSystemDiskVO? {
        return client.get(ApiPaths.appPath("/filesystem/disks")) as? PlusApiResultListFileSystemDiskVO
    }

    /** Get primary disk */
    suspend fun getPrimaryDisk(): PlusApiResultFileSystemDiskVO? {
        return client.get(ApiPaths.appPath("/filesystem/disks/default")) as? PlusApiResultFileSystemDiskVO
    }
}
