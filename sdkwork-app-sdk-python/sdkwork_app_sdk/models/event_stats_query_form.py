from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class EventStatsQueryForm:
    """事件统计查询请求"""
    event_name: str = None
    start_date: str = None
    end_date: str = None
    interval: str = None
    device_type: str = None
    os_type: str = None
