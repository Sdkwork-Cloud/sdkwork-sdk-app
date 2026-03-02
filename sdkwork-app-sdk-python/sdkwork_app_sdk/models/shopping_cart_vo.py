from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShoppingCartVO:
    """购物车响应"""
    created_at: str = None
    updated_at: str = None
    cart_id: str = None
    uuid: str = None
    name: str = None
    description: str = None
    owner: str = None
    owner_id: int = None
    status: str = None
    groups: List[CartGroupVO] = None
    total_quantity: int = None
    total_price: float = None
    selected_quantity: int = None
    selected_price: float = None
