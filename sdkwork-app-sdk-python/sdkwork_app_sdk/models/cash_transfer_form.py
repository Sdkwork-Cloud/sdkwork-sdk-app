from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CashTransferForm:
    """现金转账请求"""
    to_user_id: str
    amount: float
    remarks: str = None
    pay_password: str = None
