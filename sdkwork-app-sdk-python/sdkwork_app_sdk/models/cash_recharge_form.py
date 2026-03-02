from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CashRechargeForm:
    """现金充值请求"""
    amount: float
    payment_method: str = None
    remarks: str = None
    coupon_id: str = None
