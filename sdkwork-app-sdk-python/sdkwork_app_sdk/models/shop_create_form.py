from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShopCreateForm:
    """店铺创建请求"""
    name: str
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
