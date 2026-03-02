from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BrowseStatisticsVO:
    """浏览统计响应"""
    created_at: str = None
    updated_at: str = None
    total_count: int = None
    total_duration: int = None
    average_duration: int = None
    today_count: int = None
    weekly_count: int = None
    monthly_count: int = None
    type_distribution: Dict[str, int] = None
    source_distribution: Dict[str, int] = None
    daily_trend: Dict[str, int] = None
