from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SkuDetailVO:
    """SKU详情"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    product_id: str = None
    product_name: str = None
    sku_code: str = None
    sku_name: str = None
    attributes: Dict[str, str] = None
    price: float = None
    original_price: float = None
    stock: int = None
    warning_stock: int = None
    sales: int = None
    main_image: str = None
    images: List[str] = None
    weight: float = None
    volume: float = None
    status: str = None
    sort: int = None
