from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AdvertClickForm:
    """广告点击请求"""
    advert_id: str
    position_id: str
    click_time: str = None
    device_id: str = None
    ip_address: str = None
    user_agent: str = None
