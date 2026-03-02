from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipInviteVO:
    """VIP邀请响应"""
    created_at: str = None
    updated_at: str = None
    invite_id: str = None
    email: str = None
    phone: str = None
    status: str = None
