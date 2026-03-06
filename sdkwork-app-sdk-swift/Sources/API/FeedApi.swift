import Foundation

public class FeedApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create feed
    public func create(body: FeedCreateForm) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.post(ApiPaths.appPath("/feeds"), body: body)
        return response as? PlusApiResultFeedItemVO
    }

    /// Unlike feed
    public func unlike(id: String) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.post(ApiPaths.appPath("/feeds/unlike/\(id)"), body: nil)
        return response as? PlusApiResultFeedItemVO
    }

    /// Uncollect feed
    public func uncollect(id: String) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.post(ApiPaths.appPath("/feeds/uncollect/\(id)"), body: nil)
        return response as? PlusApiResultFeedItemVO
    }

    /// Share feed
    public func share(id: String) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.post(ApiPaths.appPath("/feeds/share/\(id)"), body: nil)
        return response as? PlusApiResultFeedItemVO
    }

    /// Like feed
    public func like(id: String) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.post(ApiPaths.appPath("/feeds/like/\(id)"), body: nil)
        return response as? PlusApiResultFeedItemVO
    }

    /// Collect feed
    public func collect(id: String, params: [String: Any]? = nil) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.post(ApiPaths.appPath("/feeds/collect/\(id)"), body: nil, params: params)
        return response as? PlusApiResultFeedItemVO
    }

    /// Get top feeds
    public func getTopFeeds(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/top"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// Search feeds
    public func searchFeeds(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/search"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// Get recommended feeds
    public func getRecommendedFeeds(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/recommend"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// Get most viewed feeds
    public func getMostViewedFeeds(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/most-viewed"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// Get most liked feeds
    public func getMostLikedFeeds(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/most-liked"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// Get feed list
    public func getFeedList(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/list"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// Get hot feeds
    public func getHotFeeds(params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/hot"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// Get feed detail
    public func getFeedDetail(id: String) async throws -> PlusApiResultFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/detail/\(id)"))
        return response as? PlusApiResultFeedItemVO
    }

    /// Check collected status
    public func checkCollected(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.get(ApiPaths.appPath("/feeds/check-collected/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get feeds by category
    public func getFeedsByCategory(categoryId: String, params: [String: Any]? = nil) async throws -> PlusApiResultListFeedItemVO? {
        let response = try await client.get(ApiPaths.appPath("/feeds/category/\(categoryId)"), params: params)
        return response as? PlusApiResultListFeedItemVO
    }

    /// Delete feed
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.appPath("/feeds/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
