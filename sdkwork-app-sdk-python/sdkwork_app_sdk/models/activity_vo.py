from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ActivityVO:
    """活动信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    title: str = None
    subtitle: str = None
    type: str = None
    cover_image: str = None
    status: str = None
    start_time: str = None
    end_time: str = None
    has_joined: bool = None
    max_join_count: int = None
    joined_count: int = None
    tags: List[str] = None
