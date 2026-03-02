from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipUpgradeForm:
    """VIP升级请求"""
    target_level_id: int
    coupon_id: str = None
    payment_method: str = None
