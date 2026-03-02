import Foundation

public class UploadApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取上传策略
    public func getUploadPolicy(params: [String: Any]? = nil) async throws -> PlusApiResultUploadPolicyVO? {
        let response = try await client.post(ApiPaths.appPath("/upload/upload-policy"), body: nil, params: params)
        return response as? PlusApiResultUploadPolicyVO
    }

    /// 获取上传凭证
    public func getUploadCredentials(params: [String: Any]? = nil) async throws -> PlusApiResultUploadCredentialsVO? {
        let response = try await client.post(ApiPaths.appPath("/upload/upload-credentials"), body: nil, params: params)
        return response as? PlusApiResultUploadCredentialsVO
    }

    /// 获取预签名URL
    public func getPresignedUrl(body: PresignedUrlForm) async throws -> PlusApiResultPresignedUrlVO? {
        let response = try await client.post(ApiPaths.appPath("/upload/presigned-url"), body: body)
        return response as? PlusApiResultPresignedUrlVO
    }

    /// 上传图片
    public func image(body: ImageRequest? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultFileVO? {
        let response = try await client.post(ApiPaths.appPath("/upload/image"), body: body, params: params)
        return response as? PlusApiResultFileVO
    }

    /// 上传Base64图片
    public func base64Image(params: [String: Any]? = nil) async throws -> PlusApiResultFileVO? {
        let response = try await client.post(ApiPaths.appPath("/upload/image/base64"), body: nil, params: params)
        return response as? PlusApiResultFileVO
    }

    /// 获取文件列表
    public func listFiles(params: [String: Any]? = nil) async throws -> PlusApiResultPageFileVO? {
        let response = try await client.get(ApiPaths.appPath("/upload/files"), params: params)
        return response as? PlusApiResultPageFileVO
    }

    /// 多文件上传
    public func files(params: [String: Any]? = nil) async throws -> PlusApiResultListFileVO? {
        let response = try await client.post(ApiPaths.appPath("/upload/files"), body: nil, params: params)
        return response as? PlusApiResultListFileVO
    }

    /// 复制文件
    public func copyFile(fileId: String, params: [String: Any]? = nil) async throws -> PlusApiResultFileVO? {
        let response = try await client.post(ApiPaths.appPath("/upload/files/\(fileId)/copy"), body: nil, params: params)
        return response as? PlusApiResultFileVO
    }

    /// 单文件上传
    public func file(body: FileRequest? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultFileVO? {
        let response = try await client.post(ApiPaths.appPath("/upload/file"), body: body, params: params)
        return response as? PlusApiResultFileVO
    }

    /// 上传分片
    public func chunk(body: ChunkRequest? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultUploadChunkVO? {
        let response = try await client.post(ApiPaths.appPath("/upload/chunk"), body: body, params: params)
        return response as? PlusApiResultUploadChunkVO
    }

    /// 合并分片
    public func mergeChunks(params: [String: Any]? = nil) async throws -> PlusApiResultFileVO? {
        let response = try await client.post(ApiPaths.appPath("/upload/chunk/merge"), body: nil, params: params)
        return response as? PlusApiResultFileVO
    }

    /// 初始化分片上传
    public func initChunk(body: UploadInitForm) async throws -> PlusApiResultUploadInitVO? {
        let response = try await client.post(ApiPaths.appPath("/upload/chunk/init"), body: body)
        return response as? PlusApiResultUploadInitVO
    }

    /// 获取上传进度
    public func getUploadProgress(uploadId: String) async throws -> PlusApiResultUploadChunkVO? {
        let response = try await client.get(ApiPaths.appPath("/upload/task/\(uploadId)/progress"))
        return response as? PlusApiResultUploadChunkVO
    }

    /// 获取存储使用情况
    public func getStorageUsage() async throws -> PlusApiResultStorageUsageVO? {
        let response = try await client.get(ApiPaths.appPath("/upload/storage/usage"))
        return response as? PlusApiResultStorageUsageVO
    }

    /// 获取文件预签名URL
    public func getFilePresignedUrl(fileId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPresignedUrlVO? {
        let response = try await client.get(ApiPaths.appPath("/upload/presigned-url/\(fileId)"), params: params)
        return response as? PlusApiResultPresignedUrlVO
    }

    /// 获取文件详情
    public func getFileDetail(fileId: String) async throws -> PlusApiResultFileVO? {
        let response = try await client.get(ApiPaths.appPath("/upload/files/\(fileId)"))
        return response as? PlusApiResultFileVO
    }

    /// 删除文件
    public func deleteFile(fileId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/upload/files/\(fileId)"))
        return response as? PlusApiResultVoid
    }

    /// 查询分片状态
    public func getChunkStatus(params: [String: Any]? = nil) async throws -> PlusApiResultListInteger? {
        let response = try await client.get(ApiPaths.appPath("/upload/chunk/status"), params: params)
        return response as? PlusApiResultListInteger
    }

    /// 取消上传
    public func cancel(uploadId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/upload/task/\(uploadId)"))
        return response as? PlusApiResultVoid
    }
}
