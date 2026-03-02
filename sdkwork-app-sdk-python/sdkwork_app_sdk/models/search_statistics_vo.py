from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SearchStatisticsVO:
    """搜索统计响应"""
    created_at: str = None
    updated_at: str = None
    total_searches: int = None
    today_searches: int = None
    this_week_searches: int = None
    this_month_searches: int = None
    hot_keywords: Dict[str, int] = None
    type_distribution: Dict[str, int] = None
    last_search_time: str = None
