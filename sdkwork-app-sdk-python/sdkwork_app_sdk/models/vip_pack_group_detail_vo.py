from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipPackGroupDetailVO:
    """VIP套餐分组详情响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    description: str = None
    sort_weight: int = None
    packs: List[VipPackVO] = None
