from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProductDetailVO:
    """产品详情"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    title: str = None
    type: str = None
    description: str = None
    summary: str = None
    category_id: str = None
    category_name: str = None
    brand_id: str = None
    brand_name: str = None
    tag_ids: List[str] = None
    tags: List[str] = None
    main_image: str = None
    images: List[str] = None
    video_url: str = None
    price: float = None
    original_price: float = None
    stock: int = None
    sales: int = None
    status: str = None
    recommended: bool = None
    hot: bool = None
    sort: int = None
    shelf_time: str = None
    off_shelf_time: str = None
    attributes: List[ProductAttributeVO] = None
    skus: List[SkuVO] = None
    review_statistics: Dict[str, Any] = None
