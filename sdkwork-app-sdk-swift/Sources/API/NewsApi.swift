import Foundation

public class NewsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取新闻详情
    public func getNews(newsId: String) async throws -> PlusApiResultNewsDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/news/\(newsId)"))
        return response as? PlusApiResultNewsDetailVO
    }

    /// 更新新闻
    public func updateNews(newsId: String, body: NewsUpdateForm) async throws -> PlusApiResultNewsVO? {
        let response = try await client.put(ApiPaths.appPath("/news/\(newsId)"), body: body)
        return response as? PlusApiResultNewsVO
    }

    /// 删除新闻
    public func deleteNews(newsId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/news/\(newsId)"))
        return response as? PlusApiResultVoid
    }

    /// 创建新闻
    public func createNews(body: NewsCreateForm) async throws -> PlusApiResultNewsVO? {
        let response = try await client.post(ApiPaths.appPath("/news"), body: body)
        return response as? PlusApiResultNewsVO
    }

    /// 搜索新闻
    public func search(params: [String: Any]? = nil) async throws -> PlusApiResultPageNewsVO? {
        let response = try await client.get(ApiPaths.appPath("/news/search"), params: params)
        return response as? PlusApiResultPageNewsVO
    }

    /// 获取我的新闻
    public func getMy(params: [String: Any]? = nil) async throws -> PlusApiResultPageNewsVO? {
        let response = try await client.get(ApiPaths.appPath("/news/my"), params: params)
        return response as? PlusApiResultPageNewsVO
    }

    /// 获取最新新闻
    public func getLatest(params: [String: Any]? = nil) async throws -> PlusApiResultPageNewsVO? {
        let response = try await client.get(ApiPaths.appPath("/news/latest"), params: params)
        return response as? PlusApiResultPageNewsVO
    }

    /// 获取分类新闻
    public func getCategory(categoryId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageNewsVO? {
        let response = try await client.get(ApiPaths.appPath("/news/category/\(categoryId)"), params: params)
        return response as? PlusApiResultPageNewsVO
    }
}
