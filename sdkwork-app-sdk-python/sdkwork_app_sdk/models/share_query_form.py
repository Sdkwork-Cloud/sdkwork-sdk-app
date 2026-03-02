from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareQueryForm:
    """查询分享请求"""
    page: int = None
    size: int = None
    share_type: str = None
    status: str = None
    keyword: str = None
    start_time: str = None
    end_time: str = None
