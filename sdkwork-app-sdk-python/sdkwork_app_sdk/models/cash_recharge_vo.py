from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CashRechargeVO:
    """现金充值响应"""
    created_at: str = None
    updated_at: str = None
    transaction_id: str = None
    account_id: str = None
    amount: float = None
    balance_after: float = None
    status: str = None
    payment_method: str = None
    pay_url: str = None
