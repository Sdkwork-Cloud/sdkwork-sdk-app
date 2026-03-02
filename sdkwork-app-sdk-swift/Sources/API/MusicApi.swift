import Foundation

public class MusicApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取音乐详情
    public func getMusic(musicId: String) async throws -> PlusApiResultMusicDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/music/\(musicId)"))
        return response as? PlusApiResultMusicDetailVO
    }

    /// 更新音乐
    public func updateMusic(musicId: String, body: MusicUpdateForm) async throws -> PlusApiResultMusicVO? {
        let response = try await client.put(ApiPaths.appPath("/music/\(musicId)"), body: body)
        return response as? PlusApiResultMusicVO
    }

    /// 删除音乐
    public func deleteMusic(musicId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/music/\(musicId)"))
        return response as? PlusApiResultVoid
    }

    /// 上传音乐
    public func createMusic(body: MusicCreateForm) async throws -> PlusApiResultMusicVO? {
        let response = try await client.post(ApiPaths.appPath("/music"), body: body)
        return response as? PlusApiResultMusicVO
    }

    /// 发布音乐
    public func publish(musicId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/music/\(musicId)/publish"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消发布
    public func unpublish(musicId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/music/\(musicId)/publish"))
        return response as? PlusApiResultVoid
    }

    /// 点赞音乐
    public func like(musicId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/music/\(musicId)/like"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消点赞
    public func unlike(musicId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/music/\(musicId)/like"))
        return response as? PlusApiResultVoid
    }

    /// 收藏音乐
    public func favorite(musicId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/music/\(musicId)/favorite"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消收藏
    public func unfavorite(musicId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/music/\(musicId)/favorite"))
        return response as? PlusApiResultVoid
    }

    /// 记录下载
    public func recordDownload(musicId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/music/\(musicId)/download"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 创建音乐生成任务
    public func createGeneration(body: MusicGenerationForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/music"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 相似音乐生成
    public func generateSimilar(body: MusicSimilarForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/music/similar"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 音乐混音
    public func remix(body: MusicRemixForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/music/remix"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 音乐续写
    public func extend(body: MusicExtendForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/music/extend"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 获取音乐统计
    public func getMusicStatistics() async throws -> PlusApiResultMusicStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/music/statistics"))
        return response as? PlusApiResultMusicStatisticsVO
    }

    /// 搜索音乐
    public func search(params: [String: Any]? = nil) async throws -> PlusApiResultPageMusicVO? {
        let response = try await client.get(ApiPaths.appPath("/music/search"), params: params)
        return response as? PlusApiResultPageMusicVO
    }

    /// 获取公开音乐
    public func getPublic(params: [String: Any]? = nil) async throws -> PlusApiResultPageMusicVO? {
        let response = try await client.get(ApiPaths.appPath("/music/public"), params: params)
        return response as? PlusApiResultPageMusicVO
    }

    /// 获取热门音乐
    public func getPopular(params: [String: Any]? = nil) async throws -> PlusApiResultPageMusicVO? {
        let response = try await client.get(ApiPaths.appPath("/music/popular"), params: params)
        return response as? PlusApiResultPageMusicVO
    }

    /// 获取最受喜爱音乐
    public func getMostLiked(params: [String: Any]? = nil) async throws -> PlusApiResultPageMusicVO? {
        let response = try await client.get(ApiPaths.appPath("/music/liked"), params: params)
        return response as? PlusApiResultPageMusicVO
    }

    /// 获取收藏音乐
    public func getFavorite(params: [String: Any]? = nil) async throws -> PlusApiResultPageMusicVO? {
        let response = try await client.get(ApiPaths.appPath("/music/favorites"), params: params)
        return response as? PlusApiResultPageMusicVO
    }

    /// 获取任务列表
    public func listTasks(params: [String: Any]? = nil) async throws -> PlusApiResultPageGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/music/tasks"), params: params)
        return response as? PlusApiResultPageGenerationTaskVO
    }

    /// 获取任务状态
    public func getTaskStatus(taskId: String) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/music/tasks/\(taskId)"))
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 取消任务
    public func cancelTask(taskId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/generation/music/tasks/\(taskId)"))
        return response as? PlusApiResultVoid
    }

    /// 获取音乐风格列表
    public func getMusicStyles(params: [String: Any]? = nil) async throws -> PlusApiResultMusicStylesVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/music/styles"), params: params)
        return response as? PlusApiResultMusicStylesVO
    }
}
