from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TextSuggestVO:
    """文本替换建议响应"""
    created_at: str = None
    updated_at: str = None
    original_text: str = None
    suggested_text: str = None
    replacement_count: int = None
    positions: List[ReplacementPosition] = None
    alternative_suggestions: List[str] = None
