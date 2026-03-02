from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NewsUpdateForm:
    """更新新闻表单"""
    title: str = None
    summary: str = None
    url: str = None
    source: str = None
