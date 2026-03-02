from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PointsAccountInfoVO:
    """积分账户信息响应"""
    created_at: str = None
    updated_at: str = None
    account_id: str = None
    account_type: str = None
    account_type_name: str = None
    owner_id: str = None
    user_id: str = None
    available_points: int = None
    frozen_points: int = None
    total_points: int = None
    token_balance: int = None
    status: str = None
    status_name: str = None
    pending_points: int = None
    total_earned: int = None
    total_spent: int = None
    level: int = None
    level_name: str = None
    experience: int = None
