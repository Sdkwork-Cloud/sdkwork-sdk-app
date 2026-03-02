from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class StatisticsVO:
    """统计信息"""
    total_projects: int = None
    total_generations: int = None
    total_usage_time: int = None
    storage: StorageStatisticsVO = None
    daily_usage: DailyUsageVO = None
