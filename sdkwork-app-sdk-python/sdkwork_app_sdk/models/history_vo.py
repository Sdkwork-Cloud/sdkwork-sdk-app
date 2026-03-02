from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class HistoryVO:
    """账户历史记录响应"""
    created_at: str = None
    updated_at: str = None
    history_id: str = None
    account_id: str = None
    transaction_type: str = None
    transaction_type_name: str = None
    amount: float = None
    points: int = None
    tokens: int = None
    balance_before: float = None
    balance_after: float = None
    points_before: int = None
    points_after: int = None
    transaction_id: str = None
    related_id: str = None
    related_type: str = None
    remarks: str = None
    status: str = None
    status_name: str = None
    counterparty_account_id: str = None
    counterparty_user_id: str = None
    counterparty_user_name: str = None
