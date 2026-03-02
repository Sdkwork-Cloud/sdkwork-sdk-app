from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CashAccountInfoVO:
    """现金账户信息响应"""
    created_at: str = None
    updated_at: str = None
    account_id: str = None
    account_type: str = None
    account_type_name: str = None
    owner_id: str = None
    user_id: str = None
    available_balance: float = None
    frozen_balance: float = None
    total_balance: float = None
    status: str = None
    status_name: str = None
    pending_balance: float = None
    total_recharged: float = None
    total_spent: float = None
    total_withdrawn: float = None
