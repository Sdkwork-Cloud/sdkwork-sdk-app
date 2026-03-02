from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipInviteInfoVO:
    """VIP邀请信息响应"""
    created_at: str = None
    updated_at: str = None
    invite_code: str = None
    invite_link: str = None
    total_invites: int = None
    successful_invites: int = None
    reward_points: int = None
    reward_rule: str = None
