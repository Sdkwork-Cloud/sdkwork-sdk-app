from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FollowQueryForm:
    """查询关注列表请求"""
    page: int = None
    size: int = None
    query_type: str = None
    user_id: str = None
    keyword: str = None
