from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CartItemVO:
    """购物车商品项响应"""
    created_at: str = None
    updated_at: str = None
    item_id: str = None
    uuid: str = None
    cart_id: str = None
    cart_group_uuid: str = None
    product_id: str = None
    sku_id: str = None
    sku_name: str = None
    sku_code: str = None
    sku_image: str = None
    sku_price: float = None
    quantity: int = None
    price: float = None
    total_price: float = None
    selected: bool = None
