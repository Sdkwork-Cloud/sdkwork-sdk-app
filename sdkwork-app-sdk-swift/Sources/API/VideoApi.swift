import Foundation

public class VideoApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取视频详情
    public func getVideo(videoId: String) async throws -> PlusApiResultVideoDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/video/\(videoId)"))
        return response as? PlusApiResultVideoDetailVO
    }

    /// 更新视频
    public func updateVideo(videoId: String, body: VideoUpdateForm) async throws -> PlusApiResultVideoVO? {
        let response = try await client.put(ApiPaths.appPath("/video/\(videoId)"), body: body)
        return response as? PlusApiResultVideoVO
    }

    /// 删除视频
    public func deleteVideo(videoId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/video/\(videoId)"))
        return response as? PlusApiResultVoid
    }

    /// 上传视频
    public func createVideo(body: VideoCreateForm) async throws -> PlusApiResultVideoVO? {
        let response = try await client.post(ApiPaths.appPath("/video"), body: body)
        return response as? PlusApiResultVideoVO
    }

    /// 发布视频
    public func publish(videoId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/video/\(videoId)/publish"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消发布
    public func unpublish(videoId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/video/\(videoId)/publish"))
        return response as? PlusApiResultVoid
    }

    /// 点赞视频
    public func like(videoId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/video/\(videoId)/like"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消点赞
    public func unlike(videoId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/video/\(videoId)/like"))
        return response as? PlusApiResultVoid
    }

    /// 收藏视频
    public func favorite(videoId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/video/\(videoId)/favorite"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消收藏
    public func unfavorite(videoId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/video/\(videoId)/favorite"))
        return response as? PlusApiResultVoid
    }

    /// 记录下载
    public func recordDownload(videoId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/video/\(videoId)/download"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 创建视频生成任务
    public func createGeneration(body: VideoGenerationForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/video"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 视频风格转换
    public func styleTransfer(body: VideoStyleTransferForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/video/style-transfer"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 图生视频
    public func imageTo(body: ImageToVideoForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/video/image-to-video"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 视频延长
    public func extend(body: VideoExtendForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/video/extend"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 获取视频统计
    public func getVideoStatistics() async throws -> PlusApiResultVideoStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/video/statistics"))
        return response as? PlusApiResultVideoStatisticsVO
    }

    /// 搜索视频
    public func searchVideos(params: [String: Any]? = nil) async throws -> PlusApiResultPageVideoVO? {
        let response = try await client.get(ApiPaths.appPath("/video/search"), params: params)
        return response as? PlusApiResultPageVideoVO
    }

    /// 获取公开视频
    public func getPublicVideos(params: [String: Any]? = nil) async throws -> PlusApiResultPageVideoVO? {
        let response = try await client.get(ApiPaths.appPath("/video/public"), params: params)
        return response as? PlusApiResultPageVideoVO
    }

    /// 获取热门视频
    public func getPopularVideos(params: [String: Any]? = nil) async throws -> PlusApiResultPageVideoVO? {
        let response = try await client.get(ApiPaths.appPath("/video/popular"), params: params)
        return response as? PlusApiResultPageVideoVO
    }

    /// 获取最受喜爱视频
    public func getMostLikedVideos(params: [String: Any]? = nil) async throws -> PlusApiResultPageVideoVO? {
        let response = try await client.get(ApiPaths.appPath("/video/liked"), params: params)
        return response as? PlusApiResultPageVideoVO
    }

    /// 获取收藏视频
    public func getFavoriteVideos(params: [String: Any]? = nil) async throws -> PlusApiResultPageVideoVO? {
        let response = try await client.get(ApiPaths.appPath("/video/favorites"), params: params)
        return response as? PlusApiResultPageVideoVO
    }

    /// 获取任务列表
    public func listTasks(params: [String: Any]? = nil) async throws -> PlusApiResultPageGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/video/tasks"), params: params)
        return response as? PlusApiResultPageGenerationTaskVO
    }

    /// 获取任务状态
    public func getTaskStatus(taskId: String) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/video/tasks/\(taskId)"))
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 取消任务
    public func cancelTask(taskId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/generation/video/tasks/\(taskId)"))
        return response as? PlusApiResultVoid
    }
}
