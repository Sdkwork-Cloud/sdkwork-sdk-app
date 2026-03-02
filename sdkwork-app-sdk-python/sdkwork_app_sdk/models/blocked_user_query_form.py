from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BlockedUserQueryForm:
    """查询黑名单用户请求"""
    page: int = None
    size: int = None
    keyword: str = None
    start_time: str = None
    end_time: str = None
