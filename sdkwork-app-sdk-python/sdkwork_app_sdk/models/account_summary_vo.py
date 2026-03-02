from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AccountSummaryVO:
    """账户余额汇总响应"""
    created_at: str = None
    updated_at: str = None
    cash_available: float = None
    cash_frozen: float = None
    points_available: int = None
    points_frozen: int = None
    token_available: int = None
    token_frozen: int = None
    has_pay_password: bool = None
