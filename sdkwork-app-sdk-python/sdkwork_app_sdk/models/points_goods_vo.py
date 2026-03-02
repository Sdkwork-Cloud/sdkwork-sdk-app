from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PointsGoodsVO:
    """积分商品"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    image: str = None
    category: str = None
    points: int = None
    original_points: int = None
    stock: int = None
    exchangeable: bool = None
    limit_per_user: int = None
    exchanged_count: int = None
    tags: List[str] = None
    sort_weight: int = None
