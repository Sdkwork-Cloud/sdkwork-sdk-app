from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CartGroupVO:
    """购物车分组响应"""
    created_at: str = None
    updated_at: str = None
    uuid: str = None
    name: str = None
    items: List[CartItemVO] = None
    total_quantity: int = None
    total_price: float = None
