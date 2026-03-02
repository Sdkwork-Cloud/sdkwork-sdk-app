from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RecommendationVO:
    """推荐内容响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    type: str = None
    title: str = None
    description: str = None
    icon: str = None
    image: str = None
    url: str = None
    rating: float = None
    hot_score: int = None
    reason: str = None
    scenarios: List[str] = None
    tags: List[str] = None
    is_free: bool = None
    price: str = None
    priority: int = None
