from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NewsCreateForm:
    """创建新闻表单"""
    title: str
    summary: str = None
    url: str = None
    source: str = None
    category_id: int = None
