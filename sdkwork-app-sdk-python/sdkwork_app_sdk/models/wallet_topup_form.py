from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WalletTopupForm:
    """钱包充值请求"""
    amount: float
    payment_method: str = None
    request_no: str = None
    remarks: str = None
