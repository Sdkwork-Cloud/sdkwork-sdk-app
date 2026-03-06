from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WalletHistoryQueryForm:
    """钱包交易流水查询请求"""
    transaction_type: str = None
    status: str = None
    start_date: str = None
    end_date: str = None
    page_num: int = None
    page_size: int = None
    sort_field: str = None
    sort_direction: str = None
    account_type: str
