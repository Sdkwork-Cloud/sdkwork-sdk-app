from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class EventTrendVO:
    """事件趋势VO"""
    created_at: str = None
    updated_at: str = None
    event_name: str = None
    time_points: List[str] = None
    values: List[int] = None
    total_count: int = None
    growth_rate: float = None
    interval: str = None
