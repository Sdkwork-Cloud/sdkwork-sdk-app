from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SoundEffectCategoriesVO:
    """音效类别响应"""
    created_at: str = None
    updated_at: str = None
    categories: List[CategoryItem] = None
