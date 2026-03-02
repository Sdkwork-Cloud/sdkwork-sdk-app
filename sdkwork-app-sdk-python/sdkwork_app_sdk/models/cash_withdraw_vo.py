from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CashWithdrawVO:
    """现金提现响应"""
    created_at: str = None
    updated_at: str = None
    transaction_id: str = None
    account_id: str = None
    amount: float = None
    balance_after: float = None
    frozen_balance: float = None
    status: str = None
    estimated_arrival_time: str = None
    withdraw_method: str = None
