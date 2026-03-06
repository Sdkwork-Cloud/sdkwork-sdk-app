from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WalletOperationResultVO:
    """钱包操作结果"""
    created_at: str = None
    updated_at: str = None
    request_no: str = None
    transaction_id: str = None
    operation_type: str = None
    account_type: str = None
    status: str = None
    status_name: str = None
    from_account_id: str = None
    to_account_id: str = None
    amount: float = None
    points: int = None
    tokens: int = None
    from_balance_after: float = None
    to_balance_after: float = None
    from_points_after: int = None
    to_points_after: int = None
    token_after: int = None
    frozen_balance: float = None
    channel: str = None
    result_desc: str = None
    processed_at: str = None
