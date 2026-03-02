from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChannelQueryForm:
    """渠道查询请求"""
    start_date: str = None
    end_date: str = None
    channel_type: str = None
    device_type: str = None
    page_size: int = None
    page_num: int = None
