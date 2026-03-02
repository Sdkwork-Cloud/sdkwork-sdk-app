package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class SearchApi(private val client: HttpClient) {

    /** 搜索历史 */
    suspend fun getSearchHistory(params: Map<String, Any>? = null): PlusApiResultListSearchHistoryVO? {
        return client.get(ApiPaths.appPath("/search/history"), params) as? PlusApiResultListSearchHistoryVO
    }

    /** 添加搜索历史 */
    suspend fun addSearchHistory(body: SearchHistoryAddRequest): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/search/history"), body) as? PlusApiResultVoid
    }

    /** 清空搜索历史 */
    suspend fun clearSearchHistory(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/search/history")) as? PlusApiResultVoid
    }

    /** 高级搜索 */
    suspend fun advanced(body: AdvancedSearchRequest): PlusApiResultPageSearchResult? {
        return client.post(ApiPaths.appPath("/search/advanced"), body) as? PlusApiResultPageSearchResult
    }

    /** 全局搜索 */
    suspend fun global(params: Map<String, Any>? = null): PlusApiResultGlobalSearchVO? {
        return client.get(ApiPaths.appPath("/search"), params) as? PlusApiResultGlobalSearchVO
    }

    /** 搜索用户 */
    suspend fun users(params: Map<String, Any>? = null): PlusApiResultPageUserSearchResult? {
        return client.get(ApiPaths.appPath("/search/users"), params) as? PlusApiResultPageUserSearchResult
    }

    /** 搜索建议 */
    suspend fun getSearchSuggestions(params: Map<String, Any>? = null): PlusApiResultListSearchSuggestionVO? {
        return client.get(ApiPaths.appPath("/search/suggestions"), params) as? PlusApiResultListSearchSuggestionVO
    }

    /** 搜索统计 */
    suspend fun getSearchStatistics(): PlusApiResultSearchStatisticsVO? {
        return client.get(ApiPaths.appPath("/search/statistics")) as? PlusApiResultSearchStatisticsVO
    }

    /** 搜索项目 */
    suspend fun projects(params: Map<String, Any>? = null): PlusApiResultPageProjectSearchResult? {
        return client.get(ApiPaths.appPath("/search/projects"), params) as? PlusApiResultPageProjectSearchResult
    }

    /** 搜索笔记 */
    suspend fun notes(params: Map<String, Any>? = null): PlusApiResultPageNoteSearchResult? {
        return client.get(ApiPaths.appPath("/search/notes"), params) as? PlusApiResultPageNoteSearchResult
    }

    /** 热门搜索 */
    suspend fun getHotSearches(params: Map<String, Any>? = null): PlusApiResultListHotSearchVO? {
        return client.get(ApiPaths.appPath("/search/hot"), params) as? PlusApiResultListHotSearchVO
    }

    /** 筛选条件 */
    suspend fun getSearchFilters(params: Map<String, Any>? = null): PlusApiResultSearchFiltersVO? {
        return client.get(ApiPaths.appPath("/search/filters"), params) as? PlusApiResultSearchFiltersVO
    }

    /** 搜索资源 */
    suspend fun assets(params: Map<String, Any>? = null): PlusApiResultPageAssetSearchResult? {
        return client.get(ApiPaths.appPath("/search/assets"), params) as? PlusApiResultPageAssetSearchResult
    }

    /** 删除搜索历史 */
    suspend fun deleteSearchHistory(keyword: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/search/history/$keyword")) as? PlusApiResultVoid
    }
}
