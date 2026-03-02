import Foundation

public class SearchApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 搜索历史
    public func getSearchHistory(params: [String: Any]? = nil) async throws -> PlusApiResultListSearchHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/search/history"), params: params)
        return response as? PlusApiResultListSearchHistoryVO
    }

    /// 添加搜索历史
    public func addSearchHistory(body: SearchHistoryAddRequest) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/search/history"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 清空搜索历史
    public func clearSearchHistory() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/search/history"))
        return response as? PlusApiResultVoid
    }

    /// 高级搜索
    public func advanced(body: AdvancedSearchRequest) async throws -> PlusApiResultPageSearchResult? {
        let response = try await client.post(ApiPaths.appPath("/search/advanced"), body: body)
        return response as? PlusApiResultPageSearchResult
    }

    /// 全局搜索
    public func global(params: [String: Any]? = nil) async throws -> PlusApiResultGlobalSearchVO? {
        let response = try await client.get(ApiPaths.appPath("/search"), params: params)
        return response as? PlusApiResultGlobalSearchVO
    }

    /// 搜索用户
    public func users(params: [String: Any]? = nil) async throws -> PlusApiResultPageUserSearchResult? {
        let response = try await client.get(ApiPaths.appPath("/search/users"), params: params)
        return response as? PlusApiResultPageUserSearchResult
    }

    /// 搜索建议
    public func getSearchSuggestions(params: [String: Any]? = nil) async throws -> PlusApiResultListSearchSuggestionVO? {
        let response = try await client.get(ApiPaths.appPath("/search/suggestions"), params: params)
        return response as? PlusApiResultListSearchSuggestionVO
    }

    /// 搜索统计
    public func getSearchStatistics() async throws -> PlusApiResultSearchStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/search/statistics"))
        return response as? PlusApiResultSearchStatisticsVO
    }

    /// 搜索项目
    public func projects(params: [String: Any]? = nil) async throws -> PlusApiResultPageProjectSearchResult? {
        let response = try await client.get(ApiPaths.appPath("/search/projects"), params: params)
        return response as? PlusApiResultPageProjectSearchResult
    }

    /// 搜索笔记
    public func notes(params: [String: Any]? = nil) async throws -> PlusApiResultPageNoteSearchResult? {
        let response = try await client.get(ApiPaths.appPath("/search/notes"), params: params)
        return response as? PlusApiResultPageNoteSearchResult
    }

    /// 热门搜索
    public func getHotSearches(params: [String: Any]? = nil) async throws -> PlusApiResultListHotSearchVO? {
        let response = try await client.get(ApiPaths.appPath("/search/hot"), params: params)
        return response as? PlusApiResultListHotSearchVO
    }

    /// 筛选条件
    public func getSearchFilters(params: [String: Any]? = nil) async throws -> PlusApiResultSearchFiltersVO? {
        let response = try await client.get(ApiPaths.appPath("/search/filters"), params: params)
        return response as? PlusApiResultSearchFiltersVO
    }

    /// 搜索资源
    public func assets(params: [String: Any]? = nil) async throws -> PlusApiResultPageAssetSearchResult? {
        let response = try await client.get(ApiPaths.appPath("/search/assets"), params: params)
        return response as? PlusApiResultPageAssetSearchResult
    }

    /// 删除搜索历史
    public func deleteSearchHistory(keyword: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/search/history/\(keyword)"))
        return response as? PlusApiResultVoid
    }
}
