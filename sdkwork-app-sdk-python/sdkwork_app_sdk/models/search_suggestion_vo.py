from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SearchSuggestionVO:
    """搜索建议响应"""
    created_at: str = None
    updated_at: str = None
    keyword: str = None
    type: str = None
    count: int = None
