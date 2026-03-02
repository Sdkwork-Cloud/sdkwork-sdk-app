from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MemberInviteForm:
    """成员邀请请求"""
    workspace_id: str = None
    emails: List[str] = None
    role_id: str = None
    role_name: str = None
    permissions: List[str] = None
    invite_message: str = None
    expire_hours: int = None
    need_approval: bool = None
