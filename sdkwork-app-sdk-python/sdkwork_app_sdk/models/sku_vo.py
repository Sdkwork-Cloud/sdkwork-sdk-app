from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SkuVO:
    """SKU信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    product_id: str = None
    sku_code: str = None
    sku_name: str = None
    attributes: Dict[str, str] = None
    price: float = None
    original_price: float = None
    stock: int = None
    sales: int = None
    image: str = None
    status: str = None
    sort: int = None
