from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PointsGoodsDetailVO:
    """积分商品详情"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    description: str = None
    images: List[str] = None
    category: str = None
    points: int = None
    original_points: int = None
    stock: int = None
    exchangeable: bool = None
    limit_per_user: int = None
    my_exchanged_count: int = None
    exchange_note: str = None
    valid_until: str = None
    usage_instructions: str = None
