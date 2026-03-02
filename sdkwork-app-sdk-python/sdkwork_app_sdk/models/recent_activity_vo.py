from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RecentActivityVO:
    """最近活动响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    type: str = None
    title: str = None
    description: str = None
    icon: str = None
    url: str = None
    status: str = None
    resource_id: str = None
    resource_type: str = None
    creator: str = None
    create_time: str = None
    read: bool = None
    priority: int = None
