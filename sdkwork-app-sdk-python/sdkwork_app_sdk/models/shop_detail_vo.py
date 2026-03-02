from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShopDetailVO:
    """店铺详情响应"""
    created_at: str = None
    updated_at: str = None
    name: str = None
    description: str = None
    logo_url: str = None
    cover_url: str = None
    contact_phone: str = None
    contact_email: str = None
    address: str = None
    latitude: float = None
    longitude: float = None
    license_number: str = None
    tags: List[str] = None
    business_hours: str = None
    status: str = None
    status_name: str = None
    owner_id: str = None
    owner_name: str = None
    product_count: int = None
    order_count: int = None
    rating: float = None
    follower_count: int = None
