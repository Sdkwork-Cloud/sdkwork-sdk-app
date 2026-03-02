from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShopQueryForm:
    """店铺查询请求"""
    page: int = None
    size: int = None
    keyword: str = None
    status: str = None
