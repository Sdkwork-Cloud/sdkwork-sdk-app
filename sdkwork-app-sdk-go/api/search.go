package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type SearchApi struct {
    client *sdkhttp.Client
}

func NewSearchApi(client *sdkhttp.Client) *SearchApi {
    return &SearchApi{client: client}
}

// 搜索历史
func (a *SearchApi) GetSearchHistory(query map[string]interface{}) (sdktypes.PlusApiResultListSearchHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/search/history"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListSearchHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListSearchHistoryVO](raw)
}

// 添加搜索历史
func (a *SearchApi) AddSearchHistory(body sdktypes.SearchHistoryAddRequest) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/search/history"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 清空搜索历史
func (a *SearchApi) ClearSearchHistory() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/search/history"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 高级搜索
func (a *SearchApi) Advanced(body sdktypes.AdvancedSearchRequest) (sdktypes.PlusApiResultPageSearchResult, error) {
    raw, err := a.client.Post(AppApiPath("/search/advanced"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPageSearchResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageSearchResult](raw)
}

// 全局搜索
func (a *SearchApi) Global(query map[string]interface{}) (sdktypes.PlusApiResultGlobalSearchVO, error) {
    raw, err := a.client.Get(AppApiPath("/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGlobalSearchVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGlobalSearchVO](raw)
}

// 搜索用户
func (a *SearchApi) Users(query map[string]interface{}) (sdktypes.PlusApiResultPageUserSearchResult, error) {
    raw, err := a.client.Get(AppApiPath("/search/users"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageUserSearchResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageUserSearchResult](raw)
}

// 搜索建议
func (a *SearchApi) GetSearchSuggestions(query map[string]interface{}) (sdktypes.PlusApiResultListSearchSuggestionVO, error) {
    raw, err := a.client.Get(AppApiPath("/search/suggestions"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListSearchSuggestionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListSearchSuggestionVO](raw)
}

// 搜索统计
func (a *SearchApi) GetSearchStatistics() (sdktypes.PlusApiResultSearchStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/search/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSearchStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSearchStatisticsVO](raw)
}

// 搜索项目
func (a *SearchApi) Projects(query map[string]interface{}) (sdktypes.PlusApiResultPageProjectSearchResult, error) {
    raw, err := a.client.Get(AppApiPath("/search/projects"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageProjectSearchResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageProjectSearchResult](raw)
}

// 搜索笔记
func (a *SearchApi) Notes(query map[string]interface{}) (sdktypes.PlusApiResultPageNoteSearchResult, error) {
    raw, err := a.client.Get(AppApiPath("/search/notes"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageNoteSearchResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageNoteSearchResult](raw)
}

// 热门搜索
func (a *SearchApi) GetHotSearches(query map[string]interface{}) (sdktypes.PlusApiResultListHotSearchVO, error) {
    raw, err := a.client.Get(AppApiPath("/search/hot"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListHotSearchVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListHotSearchVO](raw)
}

// 筛选条件
func (a *SearchApi) GetSearchFilters(query map[string]interface{}) (sdktypes.PlusApiResultSearchFiltersVO, error) {
    raw, err := a.client.Get(AppApiPath("/search/filters"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSearchFiltersVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSearchFiltersVO](raw)
}

// 搜索资源
func (a *SearchApi) Assets(query map[string]interface{}) (sdktypes.PlusApiResultPageAssetSearchResult, error) {
    raw, err := a.client.Get(AppApiPath("/search/assets"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageAssetSearchResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageAssetSearchResult](raw)
}

// 删除搜索历史
func (a *SearchApi) DeleteSearchHistory(keyword string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/search/history/%s", keyword)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
