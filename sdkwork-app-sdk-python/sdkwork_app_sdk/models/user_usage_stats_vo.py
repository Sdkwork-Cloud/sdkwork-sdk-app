from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserUsageStatsVO:
    """用户使用统计VO"""
    created_at: str = None
    updated_at: str = None
    stats_id: str = None
    user_id: str = None
    total_sessions: int = None
    total_duration: int = None
    active_days: int = None
    last_active_days: int = None
    device_type: str = None
    os_type: str = None
    first_seen: str = None
    last_seen: str = None
    user_type: str = None
