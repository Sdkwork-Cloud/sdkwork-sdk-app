from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProductVO:
    """产品信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    title: str = None
    type: str = None
    summary: str = None
    main_image: str = None
    price: float = None
    original_price: float = None
    sales: int = None
    status: str = None
    recommended: bool = None
    hot: bool = None
    category_name: str = None
    brand_name: str = None
    tags: List[str] = None
