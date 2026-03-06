from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WalletOperationStatusVO:
    """钱包操作状态"""
    created_at: str = None
    updated_at: str = None
    request_no: str = None
    found: bool = None
    completed: bool = None
    status: str = None
    status_name: str = None
    transaction_id: str = None
    operation_type: str = None
    account_type: str = None
    processed_at: str = None
    related_transaction_ids: List[str] = None
    details: List[HistoryVO] = None
    result_desc: str = None
