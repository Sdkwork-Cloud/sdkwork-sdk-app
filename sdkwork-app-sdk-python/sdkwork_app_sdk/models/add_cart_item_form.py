from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AddCartItemForm:
    """添加购物车项请求"""
    sku_id: int
    product_id: int
    quantity: int
    cart_group_uuid: str = None
