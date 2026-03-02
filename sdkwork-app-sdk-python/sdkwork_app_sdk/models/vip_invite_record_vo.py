from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipInviteRecordVO:
    """VIP邀请记录响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    invitee_id: int = None
    invitee_nickname: str = None
    invitee_avatar: str = None
    status: str = None
    reward_points: int = None
    invited_at: str = None
    completed_at: str = None
