from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SearchHistoryVO:
    """搜索历史响应"""
    created_at: str = None
    updated_at: str = None
    keyword: str = None
    search_time: str = None
    count: int = None
