import Foundation

public class ImageApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取图片详情
    public func getImage(imageId: String) async throws -> PlusApiResultImageDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/image/\(imageId)"))
        return response as? PlusApiResultImageDetailVO
    }

    /// 更新图片
    public func updateImage(imageId: String, body: ImageUpdateForm) async throws -> PlusApiResultImageVO? {
        let response = try await client.put(ApiPaths.appPath("/image/\(imageId)"), body: body)
        return response as? PlusApiResultImageVO
    }

    /// 删除图片
    public func deleteImage(imageId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/image/\(imageId)"))
        return response as? PlusApiResultVoid
    }

    /// 上传图片
    public func createImage(body: ImageCreateForm) async throws -> PlusApiResultImageVO? {
        let response = try await client.post(ApiPaths.appPath("/image"), body: body)
        return response as? PlusApiResultImageVO
    }

    /// 点赞图片
    public func like(imageId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/image/\(imageId)/like"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消点赞
    public func unlike(imageId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/image/\(imageId)/like"))
        return response as? PlusApiResultVoid
    }

    /// 收藏图片
    public func favorite(imageId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/image/\(imageId)/favorite"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消收藏
    public func unfavorite(imageId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/image/\(imageId)/favorite"))
        return response as? PlusApiResultVoid
    }

    /// 记录下载
    public func recordDownload(imageId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/image/\(imageId)/download"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 创建图片生成任务
    public func createGeneration(body: ImageGenerationForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/image"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 生成变体
    public func createVariation(body: ImageVariationForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/image/variations"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 图片放大
    public func upscale(body: ImageUpscaleForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/image/upscale"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 图片编辑
    public func edit(body: ImageEditForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/image/edits"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 获取图片统计
    public func getImageStatistics() async throws -> PlusApiResultImageStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/image/statistics"))
        return response as? PlusApiResultImageStatisticsVO
    }

    /// 搜索图片
    public func searchImages(params: [String: Any]? = nil) async throws -> PlusApiResultPageImageVO? {
        let response = try await client.get(ApiPaths.appPath("/image/search"), params: params)
        return response as? PlusApiResultPageImageVO
    }

    /// 获取公开图片
    public func getPublicImages(params: [String: Any]? = nil) async throws -> PlusApiResultPageImageVO? {
        let response = try await client.get(ApiPaths.appPath("/image/public"), params: params)
        return response as? PlusApiResultPageImageVO
    }

    /// 获取热门图片
    public func getPopularImages(params: [String: Any]? = nil) async throws -> PlusApiResultPageImageVO? {
        let response = try await client.get(ApiPaths.appPath("/image/popular"), params: params)
        return response as? PlusApiResultPageImageVO
    }

    /// 获取最受喜爱图片
    public func getMostLikedImages(params: [String: Any]? = nil) async throws -> PlusApiResultPageImageVO? {
        let response = try await client.get(ApiPaths.appPath("/image/liked"), params: params)
        return response as? PlusApiResultPageImageVO
    }

    /// 获取收藏图片
    public func getFavoriteImages(params: [String: Any]? = nil) async throws -> PlusApiResultPageImageVO? {
        let response = try await client.get(ApiPaths.appPath("/image/favorites"), params: params)
        return response as? PlusApiResultPageImageVO
    }

    /// 获取任务列表
    public func listTasks(params: [String: Any]? = nil) async throws -> PlusApiResultPageGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/image/tasks"), params: params)
        return response as? PlusApiResultPageGenerationTaskVO
    }

    /// 获取任务状态
    public func getTaskStatus(taskId: String) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/image/tasks/\(taskId)"))
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 取消任务
    public func cancelTask(taskId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/generation/image/tasks/\(taskId)"))
        return response as? PlusApiResultVoid
    }
}
