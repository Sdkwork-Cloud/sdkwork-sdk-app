from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderItemForm:
    """订单商品项"""
    product_id: str = None
    sku_id: str = None
    quantity: int = None
    price: str = None
    product_name: str = None
    content_type: str = None
    content_id: str = None
