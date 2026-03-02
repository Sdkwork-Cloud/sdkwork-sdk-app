import Foundation

public class FeedApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 取消点赞Feed
    public func unlike(id: String) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.post(ApiPaths.appPath("/feeds/unlike/\(id)"), body: nil)
        return response as? PlusApiResultFeedItemVO
    }

    /// 取消收藏Feed
    public func uncollect(id: String) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.post(ApiPaths.appPath("/feeds/uncollect/\(id)"), body: nil)
        return response as? PlusApiResultFeedItemVO
    }

    /// 分享Feed
    public func share(id: String) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.post(ApiPaths.appPath("/feeds/share/\(id)"), body: nil)
        return response as? PlusApiResultFeedItemVO
    }

    /// 点赞Feed
    public func like(id: String) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.post(ApiPaths.appPath("/feeds/like/\(id)"), body: nil)
        return response as? PlusApiResultFeedItemVO
    }

    /// 收藏Feed
    public func collect(id: String, params: [String: Any]? = nil) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.post(ApiPaths.appPath("/feeds/collect/\(id)"), body: nil, params: params)
        return response as? PlusApiResultFeedItemVO
    }

    /// 获取置顶Feed
    public func getTopFeeds(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/top"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// 搜索Feed
    public func searchFeeds(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/search"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// 获取推荐Feed
    public func getRecommendedFeeds(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/recommend"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// 获取最多浏览Feed
    public func getMostViewedFeeds(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/most-viewed"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// 获取最多点赞Feed
    public func getMostLikedFeeds(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/most-liked"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// 获取Feed列表
    public func getFeedList(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/list"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// 获取热门Feed
    public func getHotFeeds(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/hot"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// 获取Feed详情
    public func getFeedDetail(id: String) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/detail/\(id)"))
        return response as? PlusApiResultFeedItemVO
    }

    /// 检查收藏状态
    public func checkCollected(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.get(ApiPaths.appPath("/feeds/check-collected/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// 获取分类Feed
    public func getFeedsByCategory(categoryId: String, params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/category/\(categoryId)"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }
}
