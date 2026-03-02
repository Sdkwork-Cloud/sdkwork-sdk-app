from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultAchievementRewardVO, PlusApiResultChartDataVO, PlusApiResultGenerationStatisticsVO, PlusApiResultHomeDashboardVO, PlusApiResultListAchievementVO, PlusApiResultListRecentActivityVO, PlusApiResultListRecommendationVO, PlusApiResultListShortcutVO, PlusApiResultListTodoItemVO, PlusApiResultListTrendingItemVO, PlusApiResultMapStringObject, PlusApiResultStorageStatisticsVO, PlusApiResultUsageStatisticsVO, PlusApiResultUserLevelVO, PlusApiResultUserStatisticsVO, PlusApiResultVipStatisticsVO, PlusApiResultVoid, ShortcutsUpdateForm

class DashboardApi:
    """dashboard API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def complete_todo_item(self, todoId: str) -> PlusApiResultVoid:
        """完成待办"""
        return self._client.put(f"/app/v3/api/dashboard/todos/{todoId}/complete")

    def get_shortcuts(self) -> PlusApiResultListShortcutVO:
        """快捷入口"""
        return self._client.get(f"/app/v3/api/dashboard/shortcuts")

    def update_shortcuts(self, body: ShortcutsUpdateForm) -> PlusApiResultVoid:
        """更新快捷入口"""
        return self._client.put(f"/app/v3/api/dashboard/shortcuts", json=body)

    def claim_achievement_reward(self, achievementId: str) -> PlusApiResultAchievementRewardVO:
        """领取成就奖励"""
        return self._client.post(f"/app/v3/api/dashboard/achievements/{achievementId}/claim")

    def get_trending_items(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListTrendingItemVO:
        """今日热点"""
        return self._client.get(f"/app/v3/api/dashboard/trending", params=params)

    def get_todo_items(self) -> PlusApiResultListTodoItemVO:
        """待办事项"""
        return self._client.get(f"/app/v3/api/dashboard/todos")

    def get_user_statistics(self) -> PlusApiResultUserStatisticsVO:
        """用户统计"""
        return self._client.get(f"/app/v3/api/dashboard/statistics")

    def get_vip_statistics(self) -> PlusApiResultVipStatisticsVO:
        """会员统计"""
        return self._client.get(f"/app/v3/api/dashboard/statistics/vip")

    def get_usage_statistics(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultUsageStatisticsVO:
        """使用统计"""
        return self._client.get(f"/app/v3/api/dashboard/statistics/usage", params=params)

    def get_storage_statistics(self) -> PlusApiResultStorageStatisticsVO:
        """存储统计"""
        return self._client.get(f"/app/v3/api/dashboard/statistics/storage")

    def get_generation_statistics(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultGenerationStatisticsVO:
        """生成统计"""
        return self._client.get(f"/app/v3/api/dashboard/statistics/generations", params=params)

    def get_recommendations(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListRecommendationVO:
        """推荐内容"""
        return self._client.get(f"/app/v3/api/dashboard/recommendations", params=params)

    def get_data_overview(self) -> PlusApiResultMapStringObject:
        """数据概览"""
        return self._client.get(f"/app/v3/api/dashboard/overview")

    def get_user_level(self) -> PlusApiResultUserLevelVO:
        """用户等级"""
        return self._client.get(f"/app/v3/api/dashboard/level")

    def get_home(self) -> PlusApiResultHomeDashboardVO:
        """首页数据"""
        return self._client.get(f"/app/v3/api/dashboard/home")

    def get_chart_data(self, chartType: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultChartDataVO:
        """图表数据"""
        return self._client.get(f"/app/v3/api/dashboard/charts/{chartType}", params=params)

    def get_recent_activities(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListRecentActivityVO:
        """最近活动"""
        return self._client.get(f"/app/v3/api/dashboard/activities", params=params)

    def get_achievements(self) -> PlusApiResultListAchievementVO:
        """成就列表"""
        return self._client.get(f"/app/v3/api/dashboard/achievements")
