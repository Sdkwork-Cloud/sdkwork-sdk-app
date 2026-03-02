from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NotificationQueryForm:
    """通知查询表单"""
    type: str = None
    read: bool = None
    page: int = None
    size: int = None
    sort_by: str = None
    sort_direction: str = None
