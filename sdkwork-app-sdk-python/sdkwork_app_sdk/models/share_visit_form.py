from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareVisitForm:
    """分享访问请求"""
    share_id: str = None
    visit_type: str = None
    user_agent: str = None
    ip_address: str = None
    device_info: str = None
