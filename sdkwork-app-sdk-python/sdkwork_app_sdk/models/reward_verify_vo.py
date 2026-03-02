from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RewardVerifyVO:
    """奖励验证VO"""
    created_at: str = None
    updated_at: str = None
    verified: bool = None
    reward_id: str = None
    reward_type: str = None
    reward_amount: int = None
    message: str = None
    verification_token: str = None
