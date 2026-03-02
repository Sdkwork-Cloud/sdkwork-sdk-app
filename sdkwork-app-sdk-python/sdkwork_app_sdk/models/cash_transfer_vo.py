from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CashTransferVO:
    """现金转账响应"""
    created_at: str = None
    updated_at: str = None
    transaction_id: str = None
    from_account_id: str = None
    to_account_id: str = None
    amount: float = None
    status: str = None
    from_balance_after: float = None
    to_balance_after: float = None
