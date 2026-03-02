from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AnnouncementQueryForm:
    """公告查询Form"""
    type: str = None
    status: str = None
    page_size: int = None
    page_num: int = None
