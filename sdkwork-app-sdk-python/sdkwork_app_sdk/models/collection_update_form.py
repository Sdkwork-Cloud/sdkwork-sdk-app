from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CollectionUpdateForm:
    """更新合集表单"""
    name: str = None
    description: str = None
    cover_image: str = None
