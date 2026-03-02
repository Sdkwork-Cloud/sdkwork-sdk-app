from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserStatisticsVO:
    """用户统计响应"""
    created_at: str = None
    updated_at: str = None
    user_id: str = None
    username: str = None
    avatar: str = None
    registered_at: str = None
    last_login_at: str = None
    login_count: int = None
    total_usage_time: int = None
    total_generations: int = None
    total_projects: int = None
    total_files: int = None
    total_storage: int = None
    level: UserLevelVO = None
    vip_info: VipStatisticsVO = None
    achievement_stats: AchievementStatisticsVO = None
    usage_stats: UsageStatisticsVO = None
    generation_stats: GenerationStatisticsVO = None
