from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CouponListForm:
    """优惠券列表查询请求"""
    type: str = None
    status: str = None
    keyword: str = None
    page_num: int = None
    page_size: int = None
