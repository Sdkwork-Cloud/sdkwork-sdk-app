from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InviteRewardClaimVO:
    """邀请奖励领取响应"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    amount: str = None
    balance: str = None
    transaction_id: str = None
