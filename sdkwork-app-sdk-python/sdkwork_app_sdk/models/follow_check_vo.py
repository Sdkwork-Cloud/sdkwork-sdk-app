from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FollowCheckVO:
    """关注检查响应"""
    created_at: str = None
    updated_at: str = None
    is_following: bool = None
    follow_time: str = None
    is_followed_by: bool = None
