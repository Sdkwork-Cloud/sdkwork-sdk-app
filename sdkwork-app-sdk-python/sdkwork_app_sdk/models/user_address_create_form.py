from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserAddressCreateForm:
    """创建用户地址请求"""
    name: str
    phone: str
    country_code: str = None
    province_code: str = None
    city_code: str = None
    district_code: str = None
    address_detail: str
    postal_code: str = None
    is_default: bool = None
