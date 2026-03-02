from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserCouponListForm:
    """用户优惠券列表查询请求"""
    status: str = None
    type: str = None
    page_num: int = None
    page_size: int = None
