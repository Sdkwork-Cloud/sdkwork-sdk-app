from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareVisitorQueryForm:
    """查询分享访客请求"""
    share_id: str = None
    page: int = None
    size: int = None
    start_time: str = None
    end_time: str = None
