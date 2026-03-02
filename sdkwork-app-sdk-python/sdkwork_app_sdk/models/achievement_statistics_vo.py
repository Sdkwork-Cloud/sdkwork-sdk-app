from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AchievementStatisticsVO:
    """成就统计"""
    total_achievements: int = None
    unlocked_achievements: int = None
    completion_rate: float = None
    total_points: int = None
    recent_achievements: List[AchievementVO] = None
