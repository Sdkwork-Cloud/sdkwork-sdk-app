from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WalletTransferForm:
    """钱包转账请求"""
    account_type: str
    to_user_id: str
    amount: float = None
    points: int = None
    request_no: str = None
    remarks: str = None
