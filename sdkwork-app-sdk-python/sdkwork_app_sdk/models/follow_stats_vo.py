from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FollowStatsVO:
    """关注统计响应"""
    created_at: str = None
    updated_at: str = None
    following_count: int = None
    followers_count: int = None
    mutual_count: int = None
