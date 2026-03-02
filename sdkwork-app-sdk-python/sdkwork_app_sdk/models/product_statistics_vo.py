from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProductStatisticsVO:
    """产品统计"""
    created_at: str = None
    updated_at: str = None
    product_id: str = None
    total_sales: int = None
    total_stock: int = None
    review_count: int = None
    average_rating: float = None
    view_count: int = None
    favorite_count: int = None
    share_count: int = None
    sales_trend: Dict[str, int] = None
    stock_trend: Dict[str, int] = None
