from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UsageStatisticsVO:
    """使用统计响应"""
    created_at: str = None
    updated_at: str = None
    today_usage: int = None
    week_usage: int = None
    month_usage: int = None
    total_usage: int = None
    avg_daily_usage: float = None
    max_daily_usage: int = None
    frequency: UsageFrequencyVO = None
    time_distribution: UsageTimeDistributionVO = None
