from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InviteRecordQueryForm:
    """查询邀请记录请求"""
    page: int = None
    size: int = None
    status: str = None
    start_time: str = None
    end_time: str = None
