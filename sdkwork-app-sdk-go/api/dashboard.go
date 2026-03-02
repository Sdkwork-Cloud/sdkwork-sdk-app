package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type DashboardApi struct {
    client *sdkhttp.Client
}

func NewDashboardApi(client *sdkhttp.Client) *DashboardApi {
    return &DashboardApi{client: client}
}

// 完成待办
func (a *DashboardApi) CompleteTodoItem(todoId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/dashboard/todos/%s/complete", todoId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 快捷入口
func (a *DashboardApi) GetShortcuts() (sdktypes.PlusApiResultListShortcutVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/shortcuts"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListShortcutVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListShortcutVO](raw)
}

// 更新快捷入口
func (a *DashboardApi) UpdateShortcuts(body sdktypes.ShortcutsUpdateForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/dashboard/shortcuts"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 领取成就奖励
func (a *DashboardApi) ClaimAchievementReward(achievementId string) (sdktypes.PlusApiResultAchievementRewardVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/dashboard/achievements/%s/claim", achievementId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultAchievementRewardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAchievementRewardVO](raw)
}

// 今日热点
func (a *DashboardApi) GetTrendingItems(query map[string]interface{}) (sdktypes.PlusApiResultListTrendingItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/trending"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListTrendingItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListTrendingItemVO](raw)
}

// 待办事项
func (a *DashboardApi) GetTodoItems() (sdktypes.PlusApiResultListTodoItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/todos"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListTodoItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListTodoItemVO](raw)
}

// 用户统计
func (a *DashboardApi) GetUserStatistics() (sdktypes.PlusApiResultUserStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserStatisticsVO](raw)
}

// 会员统计
func (a *DashboardApi) GetVipStatistics() (sdktypes.PlusApiResultVipStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/statistics/vip"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVipStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipStatisticsVO](raw)
}

// 使用统计
func (a *DashboardApi) GetUsageStatistics(query map[string]interface{}) (sdktypes.PlusApiResultUsageStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/statistics/usage"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUsageStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUsageStatisticsVO](raw)
}

// 存储统计
func (a *DashboardApi) GetStorageStatistics() (sdktypes.PlusApiResultStorageStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/statistics/storage"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultStorageStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultStorageStatisticsVO](raw)
}

// 生成统计
func (a *DashboardApi) GetGenerationStatistics(query map[string]interface{}) (sdktypes.PlusApiResultGenerationStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/statistics/generations"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationStatisticsVO](raw)
}

// 推荐内容
func (a *DashboardApi) GetRecommendations(query map[string]interface{}) (sdktypes.PlusApiResultListRecommendationVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/recommendations"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListRecommendationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListRecommendationVO](raw)
}

// 数据概览
func (a *DashboardApi) GetDataOverview() (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/overview"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// 用户等级
func (a *DashboardApi) GetUserLevel() (sdktypes.PlusApiResultUserLevelVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/level"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserLevelVO](raw)
}

// 首页数据
func (a *DashboardApi) GetHome() (sdktypes.PlusApiResultHomeDashboardVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/home"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultHomeDashboardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultHomeDashboardVO](raw)
}

// 图表数据
func (a *DashboardApi) GetChartData(chartType string, query map[string]interface{}) (sdktypes.PlusApiResultChartDataVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/dashboard/charts/%s", chartType)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultChartDataVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultChartDataVO](raw)
}

// 最近活动
func (a *DashboardApi) GetRecentActivities(query map[string]interface{}) (sdktypes.PlusApiResultListRecentActivityVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/activities"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListRecentActivityVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListRecentActivityVO](raw)
}

// 成就列表
func (a *DashboardApi) GetAchievements() (sdktypes.PlusApiResultListAchievementVO, error) {
    raw, err := a.client.Get(AppApiPath("/dashboard/achievements"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListAchievementVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListAchievementVO](raw)
}
