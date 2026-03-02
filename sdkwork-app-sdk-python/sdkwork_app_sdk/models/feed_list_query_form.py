from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FeedListQueryForm:
    """Feed列表查询表单"""
    page_num: int = None
    page_size: int = None
    sort_field: str = None
    sort_direction: str = None
    type: str = None
    content_type: str = None
    keyword: str = None
    author_id: int = None
    size: int = None
    page: int = None
