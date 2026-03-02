from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class HomeDashboardVO:
    """首页仪表盘响应"""
    created_at: str = None
    updated_at: str = None
    user_info: UserInfoVO = None
    statistics: StatisticsVO = None
    shortcuts: List[ShortcutVO] = None
    recent_activities: List[RecentActivityVO] = None
    recent_projects: List[RecentProjectVO] = None
    todo_items: List[TodoItemVO] = None
    recommendations: List[RecommendationVO] = None
    trending_items: List[TrendingItemVO] = None
    achievements: List[AchievementVO] = None
    notifications: List[PopupNotificationVO] = None
    chart_data: List[ChartDataVO] = None
