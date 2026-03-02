from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AdvertImpressionForm:
    """广告展示请求"""
    advert_id: str
    position_id: str
    impression_time: str = None
    device_id: str = None
    ip_address: str = None
    user_agent: str = None
    screen_size: str = None
