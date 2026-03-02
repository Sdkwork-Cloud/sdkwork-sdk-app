package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private final HttpClient client;
    
    public SearchApi(HttpClient client) {
        this.client = client;
    }

    /** 搜索历史 */
    public PlusApiResultListSearchHistoryVO getSearchHistory(Map<String, Object> params) throws Exception {
        return (PlusApiResultListSearchHistoryVO) client.get(ApiPaths.appPath("/search/history"), params);
    }

    /** 添加搜索历史 */
    public PlusApiResultVoid addSearchHistory(SearchHistoryAddRequest body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/search/history"), body);
    }

    /** 清空搜索历史 */
    public PlusApiResultVoid clearSearchHistory() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/search/history"));
    }

    /** 高级搜索 */
    public PlusApiResultPageSearchResult advanced(AdvancedSearchRequest body) throws Exception {
        return (PlusApiResultPageSearchResult) client.post(ApiPaths.appPath("/search/advanced"), body);
    }

    /** 全局搜索 */
    public PlusApiResultGlobalSearchVO global(Map<String, Object> params) throws Exception {
        return (PlusApiResultGlobalSearchVO) client.get(ApiPaths.appPath("/search"), params);
    }

    /** 搜索用户 */
    public PlusApiResultPageUserSearchResult users(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageUserSearchResult) client.get(ApiPaths.appPath("/search/users"), params);
    }

    /** 搜索建议 */
    public PlusApiResultListSearchSuggestionVO getSearchSuggestions(Map<String, Object> params) throws Exception {
        return (PlusApiResultListSearchSuggestionVO) client.get(ApiPaths.appPath("/search/suggestions"), params);
    }

    /** 搜索统计 */
    public PlusApiResultSearchStatisticsVO getSearchStatistics() throws Exception {
        return (PlusApiResultSearchStatisticsVO) client.get(ApiPaths.appPath("/search/statistics"));
    }

    /** 搜索项目 */
    public PlusApiResultPageProjectSearchResult projects(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageProjectSearchResult) client.get(ApiPaths.appPath("/search/projects"), params);
    }

    /** 搜索笔记 */
    public PlusApiResultPageNoteSearchResult notes(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageNoteSearchResult) client.get(ApiPaths.appPath("/search/notes"), params);
    }

    /** 热门搜索 */
    public PlusApiResultListHotSearchVO getHotSearches(Map<String, Object> params) throws Exception {
        return (PlusApiResultListHotSearchVO) client.get(ApiPaths.appPath("/search/hot"), params);
    }

    /** 筛选条件 */
    public PlusApiResultSearchFiltersVO getSearchFilters(Map<String, Object> params) throws Exception {
        return (PlusApiResultSearchFiltersVO) client.get(ApiPaths.appPath("/search/filters"), params);
    }

    /** 搜索资源 */
    public PlusApiResultPageAssetSearchResult assets(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageAssetSearchResult) client.get(ApiPaths.appPath("/search/assets"), params);
    }

    /** 删除搜索历史 */
    public PlusApiResultVoid deleteSearchHistory(String keyword) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/search/history/" + keyword + ""));
    }
}
