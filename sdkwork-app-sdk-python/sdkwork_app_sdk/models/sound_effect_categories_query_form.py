from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SoundEffectCategoriesQueryForm:
    """音效类别查询请求"""
    parent_category: str = None
    language: str = None
    include_subcategories: bool = None
