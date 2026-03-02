from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InviteRecordVO:
    """邀请记录响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    invitee_id: str = None
    invitee_nickname: str = None
    invite_time: str = None
    status: str = None
    reward_amount: str = None
