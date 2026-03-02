from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CartStatisticsVO:
    """购物车统计响应"""
    created_at: str = None
    updated_at: str = None
    cart_id: str = None
    item_count: int = None
    total_quantity: int = None
    total_price: float = None
    selected_item_count: int = None
    selected_quantity: int = None
    selected_price: float = None
