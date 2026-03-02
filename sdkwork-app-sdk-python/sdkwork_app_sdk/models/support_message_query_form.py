from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SupportMessageQueryForm:
    """支持消息查询表单"""
    session_id: str = None
    page: int = None
    size: int = None
