from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipPurchaseVO:
    """VIP购买响应"""
    created_at: str = None
    updated_at: str = None
    order_id: str = None
    pack_id: int = None
    pack_name: str = None
    amount: float = None
    duration_days: int = None
    target_level_id: int = None
    target_level_name: str = None
    status: str = None
