from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class EventTrackForm:
    """事件追踪请求"""
    event_name: str
    event_type: str = None
    timestamp: str = None
    device_id: str = None
    user_id: str = None
    properties: Dict[str, Any] = None
    session_id: str = None
    page_url: str = None
    referrer: str = None
