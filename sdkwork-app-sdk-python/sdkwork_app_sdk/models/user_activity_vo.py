from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserActivityVO:
    """用户活动VO"""
    created_at: str = None
    updated_at: str = None
    activity_id: str = None
    user_id: str = None
    activity_type: str = None
    activity_name: str = None
    timestamp: str = None
    device_id: str = None
    ip_address: str = None
    page_url: str = None
    referrer: str = None
