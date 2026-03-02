from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PageViewTrackForm:
    """页面访问追踪请求"""
    page_url: str
    page_title: str = None
    referrer: str = None
    timestamp: str = None
    device_id: str = None
    user_id: str = None
    properties: Dict[str, Any] = None
    session_id: str = None
    duration: int = None
