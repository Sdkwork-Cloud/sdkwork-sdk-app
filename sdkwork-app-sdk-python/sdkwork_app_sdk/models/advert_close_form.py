from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AdvertCloseForm:
    """广告关闭请求"""
    advert_id: str
    position_id: str
    close_time: str = None
    duration: str = None
    device_id: str = None
    ip_address: str = None
