from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class EventStatsVO:
    """事件统计VO"""
    created_at: str = None
    updated_at: str = None
    event_name: str = None
    total_count: int = None
    average_per_user: float = None
    hourly_stats: Dict[str, int] = None
    daily_stats: Dict[str, int] = None
    top_properties: Dict[str, Any] = None
