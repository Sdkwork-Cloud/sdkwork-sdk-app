from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareVisitorVO:
    """分享访客响应"""
    created_at: str = None
    updated_at: str = None
    visitor_id: str = None
    visit_time: str = None
    user_agent: str = None
    ip_address: str = None
    device_info: str = None
    visit_type: str = None
