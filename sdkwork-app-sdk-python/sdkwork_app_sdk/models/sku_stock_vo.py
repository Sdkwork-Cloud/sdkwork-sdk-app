from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SkuStockVO:
    """SKU库存响应"""
    created_at: str = None
    updated_at: str = None
    sku_id: str = None
    product_id: str = None
    sku_code: str = None
    sku_name: str = None
    quantity: int = None
    warning_stock: int = None
    locked_stock: int = None
    available_stock: int = None
    status: str = None
