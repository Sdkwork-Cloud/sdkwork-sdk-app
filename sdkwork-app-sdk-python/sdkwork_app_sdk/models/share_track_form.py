from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareTrackForm:
    """分享追踪请求"""
    share_id: str = None
    track_type: str = None
    user_agent: str = None
    ip_address: str = None
    device_info: str = None
