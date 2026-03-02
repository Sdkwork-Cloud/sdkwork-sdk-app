from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipPurchaseForm:
    """VIP购买请求"""
    pack_id: int
    coupon_id: str = None
    payment_method: str = None
