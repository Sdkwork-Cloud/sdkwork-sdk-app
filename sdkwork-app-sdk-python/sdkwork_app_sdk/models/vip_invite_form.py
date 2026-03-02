from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipInviteForm:
    """VIP邀请请求"""
    email: str = None
    phone: str = None
    channel: str = None
