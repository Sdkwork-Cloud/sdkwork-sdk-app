from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserActivityQueryForm:
    """用户活动查询请求"""
    start_date: str = None
    end_date: str = None
    activity_type: str = None
    user_id: str = None
    page_size: int = None
    page_num: int = None
