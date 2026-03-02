from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FunnelQueryForm:
    """漏斗查询请求"""
    funnel_name: str = None
    events: List[str]
    start_date: str = None
    end_date: str = None
    device_type: str = None
    os_type: str = None
