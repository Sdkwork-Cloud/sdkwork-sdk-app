from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PointsGoodsQueryForm:
    """积分商品查询请求"""
    page_num: int = None
    page_size: int = None
    sort_field: str = None
    sort_direction: str = None
    category: str = None
    min_points: int = None
    max_points: int = None
    exchangeable: bool = None
    size: int = None
    page: int = None
