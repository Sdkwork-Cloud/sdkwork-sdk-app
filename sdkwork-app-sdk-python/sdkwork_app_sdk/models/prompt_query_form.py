from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PromptQueryForm:
    """查询提示语请求"""
    keyword: str = None
    type: str = None
    biz_type: str = None
    enabled: bool = None
    model: str = None
    is_public: bool = None
    is_favorite: bool = None
    page: int = None
    size: int = None
    sort_by: str = None
    sort_direction: str = None
