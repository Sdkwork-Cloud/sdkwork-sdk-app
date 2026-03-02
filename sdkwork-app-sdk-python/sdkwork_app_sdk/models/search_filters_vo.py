from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SearchFiltersVO:
    """搜索筛选条件响应"""
    created_at: str = None
    updated_at: str = None
    type_filters: Dict[str, str] = None
    date_filters: Dict[str, str] = None
    other_filters: Dict[str, Any] = None
