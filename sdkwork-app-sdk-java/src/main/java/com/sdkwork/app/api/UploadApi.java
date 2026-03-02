package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class UploadApi {
    private final HttpClient client;
    
    public UploadApi(HttpClient client) {
        this.client = client;
    }

    /** 获取上传策略 */
    public PlusApiResultUploadPolicyVO getUploadPolicy(Map<String, Object> params) throws Exception {
        return (PlusApiResultUploadPolicyVO) client.post(ApiPaths.appPath("/upload/upload-policy"), null, params);
    }

    /** 获取上传凭证 */
    public PlusApiResultUploadCredentialsVO getUploadCredentials(Map<String, Object> params) throws Exception {
        return (PlusApiResultUploadCredentialsVO) client.post(ApiPaths.appPath("/upload/upload-credentials"), null, params);
    }

    /** 获取预签名URL */
    public PlusApiResultPresignedUrlVO getPresignedUrl(PresignedUrlForm body) throws Exception {
        return (PlusApiResultPresignedUrlVO) client.post(ApiPaths.appPath("/upload/presigned-url"), body);
    }

    /** 上传图片 */
    public PlusApiResultFileVO image(ImageRequest body, Map<String, Object> params) throws Exception {
        return (PlusApiResultFileVO) client.post(ApiPaths.appPath("/upload/image"), body, params);
    }

    /** 上传Base64图片 */
    public PlusApiResultFileVO base64Image(Map<String, Object> params) throws Exception {
        return (PlusApiResultFileVO) client.post(ApiPaths.appPath("/upload/image/base64"), null, params);
    }

    /** 获取文件列表 */
    public PlusApiResultPageFileVO listFiles(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageFileVO) client.get(ApiPaths.appPath("/upload/files"), params);
    }

    /** 多文件上传 */
    public PlusApiResultListFileVO files(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFileVO) client.post(ApiPaths.appPath("/upload/files"), null, params);
    }

    /** 复制文件 */
    public PlusApiResultFileVO copyFile(String fileId, Map<String, Object> params) throws Exception {
        return (PlusApiResultFileVO) client.post(ApiPaths.appPath("/upload/files/" + fileId + "/copy"), null, params);
    }

    /** 单文件上传 */
    public PlusApiResultFileVO file(FileRequest body, Map<String, Object> params) throws Exception {
        return (PlusApiResultFileVO) client.post(ApiPaths.appPath("/upload/file"), body, params);
    }

    /** 上传分片 */
    public PlusApiResultUploadChunkVO chunk(ChunkRequest body, Map<String, Object> params) throws Exception {
        return (PlusApiResultUploadChunkVO) client.post(ApiPaths.appPath("/upload/chunk"), body, params);
    }

    /** 合并分片 */
    public PlusApiResultFileVO mergeChunks(Map<String, Object> params) throws Exception {
        return (PlusApiResultFileVO) client.post(ApiPaths.appPath("/upload/chunk/merge"), null, params);
    }

    /** 初始化分片上传 */
    public PlusApiResultUploadInitVO initChunk(UploadInitForm body) throws Exception {
        return (PlusApiResultUploadInitVO) client.post(ApiPaths.appPath("/upload/chunk/init"), body);
    }

    /** 获取上传进度 */
    public PlusApiResultUploadChunkVO getUploadProgress(String uploadId) throws Exception {
        return (PlusApiResultUploadChunkVO) client.get(ApiPaths.appPath("/upload/task/" + uploadId + "/progress"));
    }

    /** 获取存储使用情况 */
    public PlusApiResultStorageUsageVO getStorageUsage() throws Exception {
        return (PlusApiResultStorageUsageVO) client.get(ApiPaths.appPath("/upload/storage/usage"));
    }

    /** 获取文件预签名URL */
    public PlusApiResultPresignedUrlVO getFilePresignedUrl(String fileId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPresignedUrlVO) client.get(ApiPaths.appPath("/upload/presigned-url/" + fileId + ""), params);
    }

    /** 获取文件详情 */
    public PlusApiResultFileVO getFileDetail(String fileId) throws Exception {
        return (PlusApiResultFileVO) client.get(ApiPaths.appPath("/upload/files/" + fileId + ""));
    }

    /** 删除文件 */
    public PlusApiResultVoid deleteFile(String fileId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/upload/files/" + fileId + ""));
    }

    /** 查询分片状态 */
    public PlusApiResultListInteger getChunkStatus(Map<String, Object> params) throws Exception {
        return (PlusApiResultListInteger) client.get(ApiPaths.appPath("/upload/chunk/status"), params);
    }

    /** 取消上传 */
    public PlusApiResultVoid cancel(String uploadId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/upload/task/" + uploadId + ""));
    }
}
