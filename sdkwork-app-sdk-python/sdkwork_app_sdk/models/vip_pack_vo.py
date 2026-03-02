from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipPackVO:
    """VIP套餐响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    description: str = None
    price: float = None
    original_price: float = None
    point_amount: int = None
    vip_duration_days: int = None
    level_name: str = None
    sort_weight: int = None
    recommended: bool = None
    tags: List[str] = None
