package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class UploadApi(private val client: HttpClient) {

    /** 获取上传策略 */
    suspend fun getUploadPolicy(params: Map<String, Any>? = null): PlusApiResultUploadPolicyVO? {
        return client.post(ApiPaths.appPath("/upload/upload-policy"), null, params) as? PlusApiResultUploadPolicyVO
    }

    /** 获取上传凭证 */
    suspend fun getUploadCredentials(params: Map<String, Any>? = null): PlusApiResultUploadCredentialsVO? {
        return client.post(ApiPaths.appPath("/upload/upload-credentials"), null, params) as? PlusApiResultUploadCredentialsVO
    }

    /** 获取预签名URL */
    suspend fun getPresignedUrl(body: PresignedUrlForm): PlusApiResultPresignedUrlVO? {
        return client.post(ApiPaths.appPath("/upload/presigned-url"), body) as? PlusApiResultPresignedUrlVO
    }

    /** 上传图片 */
    suspend fun image(body: ImageRequest? = null, params: Map<String, Any>? = null): PlusApiResultFileVO? {
        return client.post(ApiPaths.appPath("/upload/image"), body, params) as? PlusApiResultFileVO
    }

    /** 上传Base64图片 */
    suspend fun base64Image(params: Map<String, Any>? = null): PlusApiResultFileVO? {
        return client.post(ApiPaths.appPath("/upload/image/base64"), null, params) as? PlusApiResultFileVO
    }

    /** 获取文件列表 */
    suspend fun listFiles(params: Map<String, Any>? = null): PlusApiResultPageFileVO? {
        return client.get(ApiPaths.appPath("/upload/files"), params) as? PlusApiResultPageFileVO
    }

    /** 多文件上传 */
    suspend fun files(params: Map<String, Any>? = null): PlusApiResultListFileVO? {
        return client.post(ApiPaths.appPath("/upload/files"), null, params) as? PlusApiResultListFileVO
    }

    /** 复制文件 */
    suspend fun copyFile(fileId: String, params: Map<String, Any>? = null): PlusApiResultFileVO? {
        return client.post(ApiPaths.appPath("/upload/files/$fileId/copy"), null, params) as? PlusApiResultFileVO
    }

    /** 单文件上传 */
    suspend fun file(body: FileRequest? = null, params: Map<String, Any>? = null): PlusApiResultFileVO? {
        return client.post(ApiPaths.appPath("/upload/file"), body, params) as? PlusApiResultFileVO
    }

    /** 上传分片 */
    suspend fun chunk(body: ChunkRequest? = null, params: Map<String, Any>? = null): PlusApiResultUploadChunkVO? {
        return client.post(ApiPaths.appPath("/upload/chunk"), body, params) as? PlusApiResultUploadChunkVO
    }

    /** 合并分片 */
    suspend fun mergeChunks(params: Map<String, Any>? = null): PlusApiResultFileVO? {
        return client.post(ApiPaths.appPath("/upload/chunk/merge"), null, params) as? PlusApiResultFileVO
    }

    /** 初始化分片上传 */
    suspend fun initChunk(body: UploadInitForm): PlusApiResultUploadInitVO? {
        return client.post(ApiPaths.appPath("/upload/chunk/init"), body) as? PlusApiResultUploadInitVO
    }

    /** 获取上传进度 */
    suspend fun getUploadProgress(uploadId: String): PlusApiResultUploadChunkVO? {
        return client.get(ApiPaths.appPath("/upload/task/$uploadId/progress")) as? PlusApiResultUploadChunkVO
    }

    /** 获取存储使用情况 */
    suspend fun getStorageUsage(): PlusApiResultStorageUsageVO? {
        return client.get(ApiPaths.appPath("/upload/storage/usage")) as? PlusApiResultStorageUsageVO
    }

    /** 获取文件预签名URL */
    suspend fun getFilePresignedUrl(fileId: String, params: Map<String, Any>? = null): PlusApiResultPresignedUrlVO? {
        return client.get(ApiPaths.appPath("/upload/presigned-url/$fileId"), params) as? PlusApiResultPresignedUrlVO
    }

    /** 获取文件详情 */
    suspend fun getFileDetail(fileId: String): PlusApiResultFileVO? {
        return client.get(ApiPaths.appPath("/upload/files/$fileId")) as? PlusApiResultFileVO
    }

    /** 删除文件 */
    suspend fun deleteFile(fileId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/upload/files/$fileId")) as? PlusApiResultVoid
    }

    /** 查询分片状态 */
    suspend fun getChunkStatus(params: Map<String, Any>? = null): PlusApiResultListInteger? {
        return client.get(ApiPaths.appPath("/upload/chunk/status"), params) as? PlusApiResultListInteger
    }

    /** 取消上传 */
    suspend fun cancel(uploadId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/upload/task/$uploadId")) as? PlusApiResultVoid
    }
}
