from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InviteLinkForm:
    """生成邀请链接请求"""
    invite_type: str = None
    expire_seconds: int = None
    invite_code: str = None
    channel: str = None
