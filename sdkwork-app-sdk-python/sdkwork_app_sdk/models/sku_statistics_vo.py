from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SkuStatisticsVO:
    """SKU统计响应"""
    created_at: str = None
    updated_at: str = None
    product_id: str = None
    product_name: str = None
    total_sku_count: int = None
    enabled_sku_count: int = None
    disabled_sku_count: int = None
    total_stock: int = None
    total_sales: int = None
    average_price: float = None
    warning_stock_count: int = None
    stock_trend: Dict[str, int] = None
    sales_trend: Dict[str, int] = None
