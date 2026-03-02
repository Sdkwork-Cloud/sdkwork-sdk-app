from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InviteInfoVO:
    """邀请信息响应"""
    created_at: str = None
    updated_at: str = None
    invite_code: str = None
    invite_link: str = None
    invite_count: int = None
    reward_amount: str = None
    remaining_reward: str = None
