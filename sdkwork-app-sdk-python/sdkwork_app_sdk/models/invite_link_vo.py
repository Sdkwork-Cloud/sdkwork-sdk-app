from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InviteLinkVO:
    """邀请链接响应"""
    created_at: str = None
    updated_at: str = None
    invite_link: str = None
    invite_code: str = None
    expire_time: str = None
    qr_code: str = None
