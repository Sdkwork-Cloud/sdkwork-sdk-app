from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FollowVO:
    """关注操作响应"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    is_following: bool = None
    user_id: str = None
