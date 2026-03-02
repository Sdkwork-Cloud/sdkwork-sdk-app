from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ActivityDetailVO:
    """活动详情"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    title: str = None
    description: str = None
    type: str = None
    cover_image: str = None
    banner_images: List[str] = None
    rules: str = None
    start_time: str = None
    end_time: str = None
    participant_count: int = None
    has_joined: bool = None
    max_join_count: int = None
    joined_count: int = None
    remaining_count: int = None
    rewards: List[ActivityReward] = None
    extra_config: Dict[str, Any] = None
