from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FeedbackQueryForm:
    """反馈查询表单"""
    type: str = None
    status: str = None
    page: int = None
    size: int = None
